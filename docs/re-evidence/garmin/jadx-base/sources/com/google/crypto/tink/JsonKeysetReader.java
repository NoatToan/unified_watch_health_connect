package com.google.crypto.tink;

import ch.qos.logback.core.joran.action.Action;
import com.google.crypto.tink.proto.EncryptedKeyset;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.proto.Keyset;
import com.google.crypto.tink.proto.KeysetInfo;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.subtle.Base64;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.file.Path;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class JsonKeysetReader implements KeysetReader {
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private final boolean closeStreamAfterReading;
    private final InputStream inputStream;
    private final JSONObject json;
    private boolean urlSafeBase64;

    private JsonKeysetReader(InputStream inputStream, boolean z14) {
        this.urlSafeBase64 = false;
        this.inputStream = inputStream;
        this.closeStreamAfterReading = z14;
        this.json = null;
    }

    private EncryptedKeyset encryptedKeysetFromJson(JSONObject jSONObject) throws JSONException {
        validateEncryptedKeyset(jSONObject);
        return EncryptedKeyset.newBuilder().setEncryptedKeyset(ByteString.copyFrom(this.urlSafeBase64 ? Base64.urlSafeDecode(jSONObject.getString("encryptedKeyset")) : Base64.decode(jSONObject.getString("encryptedKeyset")))).setKeysetInfo(keysetInfoFromJson(jSONObject.getJSONObject("keysetInfo"))).build();
    }

    private static KeyData.KeyMaterialType getKeyMaterialType(String str) throws JSONException {
        if (str.equals("SYMMETRIC")) {
            return KeyData.KeyMaterialType.SYMMETRIC;
        }
        if (str.equals("ASYMMETRIC_PRIVATE")) {
            return KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE;
        }
        if (str.equals("ASYMMETRIC_PUBLIC")) {
            return KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC;
        }
        if (str.equals("REMOTE")) {
            return KeyData.KeyMaterialType.REMOTE;
        }
        throw new JSONException("unknown key material type: ".concat(str));
    }

    private static OutputPrefixType getOutputPrefixType(String str) throws JSONException {
        if (str.equals("TINK")) {
            return OutputPrefixType.TINK;
        }
        if (str.equals("RAW")) {
            return OutputPrefixType.RAW;
        }
        if (str.equals("LEGACY")) {
            return OutputPrefixType.LEGACY;
        }
        if (str.equals("CRUNCHY")) {
            return OutputPrefixType.CRUNCHY;
        }
        throw new JSONException("unknown output prefix type: ".concat(str));
    }

    private static KeyStatusType getStatus(String str) throws JSONException {
        if (str.equals("ENABLED")) {
            return KeyStatusType.ENABLED;
        }
        if (str.equals("DISABLED")) {
            return KeyStatusType.DISABLED;
        }
        throw new JSONException("unknown status: ".concat(str));
    }

    private KeyData keyDataFromJson(JSONObject jSONObject) throws JSONException {
        validateKeyData(jSONObject);
        return KeyData.newBuilder().setTypeUrl(jSONObject.getString("typeUrl")).setValue(ByteString.copyFrom(this.urlSafeBase64 ? Base64.urlSafeDecode(jSONObject.getString("value")) : Base64.decode(jSONObject.getString("value")))).setKeyMaterialType(getKeyMaterialType(jSONObject.getString("keyMaterialType"))).build();
    }

    private Keyset.Key keyFromJson(JSONObject jSONObject) throws JSONException {
        validateKey(jSONObject);
        return Keyset.Key.newBuilder().setStatus(getStatus(jSONObject.getString("status"))).setKeyId(jSONObject.getInt("keyId")).setOutputPrefixType(getOutputPrefixType(jSONObject.getString("outputPrefixType"))).setKeyData(keyDataFromJson(jSONObject.getJSONObject("keyData"))).build();
    }

    private static KeysetInfo.KeyInfo keyInfoFromJson(JSONObject jSONObject) {
        return KeysetInfo.KeyInfo.newBuilder().setStatus(getStatus(jSONObject.getString("status"))).setKeyId(jSONObject.getInt("keyId")).setOutputPrefixType(getOutputPrefixType(jSONObject.getString("outputPrefixType"))).setTypeUrl(jSONObject.getString("typeUrl")).build();
    }

    private Keyset keysetFromJson(JSONObject jSONObject) throws JSONException {
        validateKeyset(jSONObject);
        Keyset.Builder builderNewBuilder = Keyset.newBuilder();
        if (jSONObject.has("primaryKeyId")) {
            builderNewBuilder.setPrimaryKeyId(jSONObject.getInt("primaryKeyId"));
        }
        JSONArray jSONArray = jSONObject.getJSONArray(Action.KEY_ATTRIBUTE);
        for (int i14 = 0; i14 < jSONArray.length(); i14++) {
            builderNewBuilder.addKey(keyFromJson(jSONArray.getJSONObject(i14)));
        }
        return builderNewBuilder.build();
    }

    private static KeysetInfo keysetInfoFromJson(JSONObject jSONObject) throws JSONException {
        KeysetInfo.Builder builderNewBuilder = KeysetInfo.newBuilder();
        if (jSONObject.has("primaryKeyId")) {
            builderNewBuilder.setPrimaryKeyId(jSONObject.getInt("primaryKeyId"));
        }
        if (jSONObject.has("keyInfo")) {
            JSONArray jSONArray = jSONObject.getJSONArray("keyInfo");
            for (int i14 = 0; i14 < jSONArray.length(); i14++) {
                builderNewBuilder.addKeyInfo(keyInfoFromJson(jSONArray.getJSONObject(i14)));
            }
        }
        return builderNewBuilder.build();
    }

    private static void validateEncryptedKeyset(JSONObject jSONObject) throws JSONException {
        if (!jSONObject.has("encryptedKeyset")) {
            throw new JSONException("invalid encrypted keyset");
        }
    }

    private static void validateKey(JSONObject jSONObject) throws JSONException {
        if (!jSONObject.has("keyData") || !jSONObject.has("status") || !jSONObject.has("keyId") || !jSONObject.has("outputPrefixType")) {
            throw new JSONException("invalid key");
        }
    }

    private static void validateKeyData(JSONObject jSONObject) throws JSONException {
        if (!jSONObject.has("typeUrl") || !jSONObject.has("value") || !jSONObject.has("keyMaterialType")) {
            throw new JSONException("invalid keyData");
        }
    }

    private static void validateKeyset(JSONObject jSONObject) throws JSONException {
        if (!jSONObject.has(Action.KEY_ATTRIBUTE) || jSONObject.getJSONArray(Action.KEY_ATTRIBUTE).length() == 0) {
            throw new JSONException("invalid keyset");
        }
    }

    public static JsonKeysetReader withBytes(byte[] bArr) {
        return new JsonKeysetReader(new ByteArrayInputStream(bArr), true);
    }

    public static JsonKeysetReader withFile(File file) {
        return new JsonKeysetReader(new FileInputStream(file), true);
    }

    public static KeysetReader withInputStream(InputStream inputStream) {
        return new JsonKeysetReader(inputStream, false);
    }

    public static JsonKeysetReader withJsonObject(JSONObject jSONObject) {
        return new JsonKeysetReader(jSONObject);
    }

    public static JsonKeysetReader withPath(String str) {
        return withFile(new File(str));
    }

    public static JsonKeysetReader withString(String str) {
        return new JsonKeysetReader(new ByteArrayInputStream(str.getBytes(UTF_8)), true);
    }

    @Override // com.google.crypto.tink.KeysetReader
    public Keyset read() throws IOException {
        try {
            try {
                JSONObject jSONObject = this.json;
                if (jSONObject != null) {
                    Keyset keysetKeysetFromJson = keysetFromJson(jSONObject);
                    InputStream inputStream = this.inputStream;
                    if (inputStream != null && this.closeStreamAfterReading) {
                        inputStream.close();
                    }
                    return keysetKeysetFromJson;
                }
                Keyset keysetKeysetFromJson2 = keysetFromJson(new JSONObject(new String(Util.readAll(this.inputStream), UTF_8)));
                InputStream inputStream2 = this.inputStream;
                if (inputStream2 != null && this.closeStreamAfterReading) {
                    inputStream2.close();
                }
                return keysetKeysetFromJson2;
            } catch (JSONException e4) {
                throw new IOException(e4);
            }
        } catch (Throwable th3) {
            InputStream inputStream3 = this.inputStream;
            if (inputStream3 != null && this.closeStreamAfterReading) {
                inputStream3.close();
            }
            throw th3;
        }
    }

    @Override // com.google.crypto.tink.KeysetReader
    public EncryptedKeyset readEncrypted() throws IOException {
        try {
            try {
                JSONObject jSONObject = this.json;
                if (jSONObject != null) {
                    EncryptedKeyset encryptedKeysetEncryptedKeysetFromJson = encryptedKeysetFromJson(jSONObject);
                    InputStream inputStream = this.inputStream;
                    if (inputStream != null && this.closeStreamAfterReading) {
                        inputStream.close();
                    }
                    return encryptedKeysetEncryptedKeysetFromJson;
                }
                EncryptedKeyset encryptedKeysetEncryptedKeysetFromJson2 = encryptedKeysetFromJson(new JSONObject(new String(Util.readAll(this.inputStream), UTF_8)));
                InputStream inputStream2 = this.inputStream;
                if (inputStream2 != null && this.closeStreamAfterReading) {
                    inputStream2.close();
                }
                return encryptedKeysetEncryptedKeysetFromJson2;
            } catch (JSONException e4) {
                throw new IOException(e4);
            }
        } catch (Throwable th3) {
            InputStream inputStream3 = this.inputStream;
            if (inputStream3 != null && this.closeStreamAfterReading) {
                inputStream3.close();
            }
            throw th3;
        }
    }

    public JsonKeysetReader withUrlSafeBase64() {
        this.urlSafeBase64 = true;
        return this;
    }

    public static JsonKeysetReader withPath(Path path) {
        return withFile(path.toFile());
    }

    private JsonKeysetReader(JSONObject jSONObject) {
        this.urlSafeBase64 = false;
        this.json = jSONObject;
        this.inputStream = null;
        this.closeStreamAfterReading = false;
    }
}
