package com.google.crypto.tink.integration.android;

import am.j;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.crypto.tink.KeysetReader;
import com.google.crypto.tink.proto.EncryptedKeyset;
import com.google.crypto.tink.proto.Keyset;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.subtle.Hex;
import java.io.CharConversionException;
import java.io.FileNotFoundException;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
public final class SharedPrefKeysetReader implements KeysetReader {
    private final String keysetName;
    private final SharedPreferences sharedPreferences;

    public SharedPrefKeysetReader(Context context, String str, String str2) {
        if (str == null) {
            h.s("keysetName cannot be null");
            throw null;
        }
        this.keysetName = str;
        Context applicationContext = context.getApplicationContext();
        if (str2 == null) {
            this.sharedPreferences = PreferenceManager.getDefaultSharedPreferences(applicationContext);
        } else {
            this.sharedPreferences = applicationContext.getSharedPreferences(str2, 0);
        }
    }

    private byte[] readPref() throws CharConversionException {
        try {
            String string = this.sharedPreferences.getString(this.keysetName, null);
            if (string != null) {
                return Hex.decode(string);
            }
            throw new FileNotFoundException("can't read keyset; the pref value " + this.keysetName + " does not exist");
        } catch (ClassCastException | IllegalArgumentException unused) {
            throw new CharConversionException(j.m("can't read keyset; the pref value ", this.keysetName, " is not a valid hex string"));
        }
    }

    @Override // com.google.crypto.tink.KeysetReader
    public Keyset read() {
        return Keyset.parseFrom(readPref(), ExtensionRegistryLite.getEmptyRegistry());
    }

    @Override // com.google.crypto.tink.KeysetReader
    public EncryptedKeyset readEncrypted() {
        return EncryptedKeyset.parseFrom(readPref(), ExtensionRegistryLite.getEmptyRegistry());
    }
}
