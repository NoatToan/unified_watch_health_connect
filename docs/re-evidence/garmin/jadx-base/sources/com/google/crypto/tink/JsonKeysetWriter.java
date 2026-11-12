package com.google.crypto.tink;

import ch.qos.logback.core.joran.action.Action;
import com.google.crypto.tink.proto.EncryptedKeyset;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.Keyset;
import com.google.crypto.tink.proto.KeysetInfo;
import com.google.crypto.tink.subtle.Base64;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class JsonKeysetWriter implements KeysetWriter {
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private final OutputStream outputStream;

    private JsonKeysetWriter(OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    private JSONObject toJson(Keyset.Key key) {
        return new JSONObject().put("keyData", toJson(key.getKeyData())).put("status", key.getStatus().name()).put("keyId", toUnsignedLong(key.getKeyId())).put("outputPrefixType", key.getOutputPrefixType().name());
    }

    private long toUnsignedLong(int i14) {
        return ((long) i14) & 4294967295L;
    }

    public static KeysetWriter withFile(File file) {
        return new JsonKeysetWriter(new FileOutputStream(file));
    }

    public static KeysetWriter withOutputStream(OutputStream outputStream) {
        return new JsonKeysetWriter(outputStream);
    }

    public static KeysetWriter withPath(String str) {
        return withFile(new File(str));
    }

    @Override // com.google.crypto.tink.KeysetWriter
    public void write(Keyset keyset) throws IOException {
        try {
            try {
                OutputStream outputStream = this.outputStream;
                String string = toJson(keyset).toString(4);
                Charset charset = UTF_8;
                outputStream.write(string.getBytes(charset));
                this.outputStream.write(System.lineSeparator().getBytes(charset));
                this.outputStream.close();
            } catch (JSONException e4) {
                throw new IOException(e4);
            }
        } catch (Throwable th3) {
            this.outputStream.close();
            throw th3;
        }
    }

    public static KeysetWriter withPath(Path path) {
        return withFile(path.toFile());
    }

    @Override // com.google.crypto.tink.KeysetWriter
    public void write(EncryptedKeyset encryptedKeyset) throws IOException {
        try {
            try {
                OutputStream outputStream = this.outputStream;
                String string = toJson(encryptedKeyset).toString(4);
                Charset charset = UTF_8;
                outputStream.write(string.getBytes(charset));
                this.outputStream.write(System.lineSeparator().getBytes(charset));
                this.outputStream.close();
            } catch (JSONException e4) {
                throw new IOException(e4);
            }
        } catch (Throwable th3) {
            this.outputStream.close();
            throw th3;
        }
    }

    private JSONObject toJson(Keyset keyset) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("primaryKeyId", toUnsignedLong(keyset.getPrimaryKeyId()));
        JSONArray jSONArray = new JSONArray();
        Iterator<Keyset.Key> it = keyset.getKeyList().iterator();
        while (it.hasNext()) {
            jSONArray.put(toJson(it.next()));
        }
        jSONObject.put(Action.KEY_ATTRIBUTE, jSONArray);
        return jSONObject;
    }

    private JSONObject toJson(KeyData keyData) {
        return new JSONObject().put("typeUrl", keyData.getTypeUrl()).put("value", Base64.encode(keyData.getValue().toByteArray())).put("keyMaterialType", keyData.getKeyMaterialType().name());
    }

    private JSONObject toJson(EncryptedKeyset encryptedKeyset) {
        return new JSONObject().put("encryptedKeyset", Base64.encode(encryptedKeyset.getEncryptedKeyset().toByteArray())).put("keysetInfo", toJson(encryptedKeyset.getKeysetInfo()));
    }

    private JSONObject toJson(KeysetInfo keysetInfo) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("primaryKeyId", toUnsignedLong(keysetInfo.getPrimaryKeyId()));
        JSONArray jSONArray = new JSONArray();
        Iterator<KeysetInfo.KeyInfo> it = keysetInfo.getKeyInfoList().iterator();
        while (it.hasNext()) {
            jSONArray.put(toJson(it.next()));
        }
        jSONObject.put("keyInfo", jSONArray);
        return jSONObject;
    }

    private JSONObject toJson(KeysetInfo.KeyInfo keyInfo) {
        return new JSONObject().put("typeUrl", keyInfo.getTypeUrl()).put("status", keyInfo.getStatus().name()).put("keyId", keyInfo.getKeyId()).put("outputPrefixType", keyInfo.getOutputPrefixType().name());
    }
}
