package com.chelosky.nagatorostickers;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;

public class InformationDialog extends AppCompatDialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Acknowledgements")
                .setMessage("All the images presented are only being used for entertainment and educational purposes.\n" +
                        "Credit goes to their creators.\n" +
                        "I wanted to learn how to create a sticker app for WhatsApp and Nagatoro was the perfect excuse.\n" +
                        "I gonna update this app adding new nagatoro stickers over time.\n" +
                        "I really sorry for the ads but i'm student i don't have money uwu.\n" +
                        "If you can, please rate the app in the play store.\n" +
                        "I apreciate the support!")
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        return builder.create();
    }
}
