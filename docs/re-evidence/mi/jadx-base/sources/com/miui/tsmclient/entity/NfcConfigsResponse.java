package com.miui.tsmclient.entity;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.common.data.CommonResponseInfo;
import com.miui.tsmclient.common.net.HttpClient;
import com.miui.tsmclient.util.IOUtils;
import com.miui.tsmclient.util.LogUtils;
import com.miui.tsmclient.util.PrefUtils;
import defpackage.w8t;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public class NfcConfigsResponse extends CommonResponseInfo {
    private static final String FILE_NAME = "nfc_configs";
    private static final int MILLISECOND_OF_HOUR = 3600000;

    @SerializedName("data")
    private NfcConfigs mNfcConfigs;

    public static class InAppConfig {

        @SerializedName("support")
        private boolean mIsSupportInappPay;

        @SerializedName("supportIssue")
        private boolean mIsSupportIssue;

        @SerializedName("maxCardNumber")
        private int mMaxCardQuantity;

        @SerializedName("validHour")
        private int mValidHour;

        public boolean isExpired(Context context) {
            if (System.currentTimeMillis() <= PrefUtils.getLong(context, PrefUtils.PREF_KEY_FETCH_NFC_CONFIG_TIME, 0L) + ((long) (this.mValidHour * 3600000))) {
                return false;
            }
            LogUtils.d("nfc config has expired");
            return true;
        }

        public boolean isSupportInappIssue() {
            return this.mIsSupportIssue;
        }

        public boolean isSupportInappPay() {
            return this.mIsSupportInappPay;
        }

        public String toString() {
            return new Gson().toJson(this);
        }
    }

    public static class NfcConfigs {

        @SerializedName("activatedAidConfig")
        private List<String> mActivatedAidConfig;

        @SerializedName("inAppConfig")
        private InAppConfig mInAppConfig;

        @SerializedName("swipeCardConfig")
        private List<SwipeCardConfig> mSwipeCardConfigs;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0 */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.io.InputStream] */
        /* JADX WARN: Type inference failed for: r1v3 */
        public static NfcConfigs createConfigFromFile(Context context) {
            FileInputStream fileInputStreamOpenFileInput;
            String str;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ?? r1 = 0;
            try {
                try {
                    fileInputStreamOpenFileInput = context.openFileInput(NfcConfigsResponse.FILE_NAME);
                    try {
                        IOUtils.copy(fileInputStreamOpenFileInput, byteArrayOutputStream);
                        String str2 = new String(byteArrayOutputStream.toByteArray());
                        LogUtils.d("string from nfc config file: " + str2);
                        NfcConfigs nfcConfigs = (NfcConfigs) new Gson().fromJson(str2, NfcConfigs.class);
                        IOUtils.closeQuietly((OutputStream) byteArrayOutputStream);
                        IOUtils.closeQuietly((InputStream) fileInputStreamOpenFileInput);
                        return nfcConfigs;
                    } catch (JsonSyntaxException unused) {
                        str = "failed to parse json";
                        LogUtils.w(str);
                        IOUtils.closeQuietly((OutputStream) byteArrayOutputStream);
                        IOUtils.closeQuietly((InputStream) fileInputStreamOpenFileInput);
                        return null;
                    } catch (FileNotFoundException unused2) {
                        str = "failed to open file: nfc_configs";
                        LogUtils.w(str);
                        IOUtils.closeQuietly((OutputStream) byteArrayOutputStream);
                        IOUtils.closeQuietly((InputStream) fileInputStreamOpenFileInput);
                        return null;
                    } catch (IOException unused3) {
                        str = "failed to write file: nfc_configs";
                        LogUtils.w(str);
                        IOUtils.closeQuietly((OutputStream) byteArrayOutputStream);
                        IOUtils.closeQuietly((InputStream) fileInputStreamOpenFileInput);
                        return null;
                    }
                } catch (Throwable th) {
                    r1 = context;
                    th = th;
                    IOUtils.closeQuietly((OutputStream) byteArrayOutputStream);
                    IOUtils.closeQuietly((InputStream) r1);
                    throw th;
                }
            } catch (JsonSyntaxException unused4) {
                fileInputStreamOpenFileInput = null;
            } catch (FileNotFoundException unused5) {
                fileInputStreamOpenFileInput = null;
            } catch (IOException unused6) {
                fileInputStreamOpenFileInput = null;
            } catch (Throwable th2) {
                th = th2;
                IOUtils.closeQuietly((OutputStream) byteArrayOutputStream);
                IOUtils.closeQuietly((InputStream) r1);
                throw th;
            }
        }

        public static NfcConfigs fetchNfcConfigFromServer(Context context) {
            String cplc;
            NfcConfigsResponse nfcConfigsResponse;
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                cplc = new CardInfo(CardInfo.CARD_TYPE_DUMMY).getTerminal().getCPLC();
            } catch (IOException e) {
                LogUtils.e("failed to fetch nfc configs from server", e);
                cplc = "";
            } catch (InterruptedException unused) {
                LogUtils.d("failed to fetch nfc configs from server for operation has been interrupted");
                cplc = "";
            }
            if (TextUtils.isEmpty(cplc)) {
                LogUtils.d("failed to fetch nfc configs from server, cplc is empty");
                return null;
            }
            try {
                nfcConfigsResponse = (NfcConfigsResponse) HttpClient.getInstance(context).execute(new w8t(cplc)).getResult();
            } catch (IOException e2) {
                LogUtils.e("fetchNfcConfigFromServer Exception occurred", e2);
                nfcConfigsResponse = null;
            }
            LogUtils.v("fetchNfcConfigFromServer time = " + (System.currentTimeMillis() - jCurrentTimeMillis));
            if (nfcConfigsResponse == null) {
                return null;
            }
            NfcConfigs nfcConfigs = nfcConfigsResponse.getNfcConfigs();
            PrefUtils.putLong(context, PrefUtils.PREF_KEY_FETCH_NFC_CONFIG_TIME, System.currentTimeMillis());
            PrefUtils.putString(context, PrefUtils.PREF_KEY_SWIPE_CARD_CONFIG, nfcConfigs.getSwipeCardConfigs());
            nfcConfigs.saveToFile(context);
            return nfcConfigs;
        }

        private void saveToFile(Context context) {
            String str;
            String string = toString();
            if (TextUtils.isEmpty(string)) {
                return;
            }
            FileOutputStream fileOutputStreamOpenFileOutput = null;
            try {
                try {
                    fileOutputStreamOpenFileOutput = context.openFileOutput(NfcConfigsResponse.FILE_NAME, 0);
                    fileOutputStreamOpenFileOutput.write(string.getBytes());
                } finally {
                    IOUtils.closeQuietly((OutputStream) fileOutputStreamOpenFileOutput);
                }
            } catch (FileNotFoundException unused) {
                str = "failed to open file: nfc_configs";
                LogUtils.w(str);
            } catch (IOException unused2) {
                str = "failed to write file: nfc_configs";
                LogUtils.w(str);
            }
        }

        public InAppConfig getInAppConfig() {
            return this.mInAppConfig;
        }

        public String getSwipeCardConfigs() {
            if (this.mSwipeCardConfigs != null) {
                return new Gson().toJson(this.mSwipeCardConfigs);
            }
            return null;
        }

        public boolean isInAppConfigExpired(Context context) {
            InAppConfig inAppConfig = this.mInAppConfig;
            return inAppConfig == null || inAppConfig.isExpired(context);
        }

        public boolean isKeepActivated(String str) {
            if (this.mActivatedAidConfig != null && !TextUtils.isEmpty(str)) {
                Iterator<String> it = this.mActivatedAidConfig.iterator();
                while (it.hasNext()) {
                    if (Pattern.compile(it.next()).matcher(str).matches()) {
                        return true;
                    }
                }
            }
            return false;
        }

        public String toString() {
            return new Gson().toJson(this);
        }
    }

    public static class SwipeCardConfig {

        @SerializedName("cardType")
        private String mCardType;

        @SerializedName("needKeyguardProtect")
        private boolean mNeedKeyguardProtect;

        @SerializedName("validHour")
        private int mValidHour;

        public boolean isExpired(Context context) {
            if (System.currentTimeMillis() <= PrefUtils.getLong(context, PrefUtils.PREF_KEY_FETCH_NFC_CONFIG_TIME, 0L) + ((long) (this.mValidHour * 3600000))) {
                return false;
            }
            LogUtils.d("nfc config has expired");
            return true;
        }

        public String toString() {
            return new Gson().toJson(this);
        }
    }

    public NfcConfigs getNfcConfigs() {
        return this.mNfcConfigs;
    }
}
