package com.huami.watch.musicupload.fragment;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import androidx.exifinterface.media.ExifInterface;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.integrity.IntegrityManager;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.wififtp.R;
import com.unionpay.tsmservice.data.Constant;
import java.io.File;
import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b4\u00105J\u0010\u0010\u0004\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0016\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tJ0\u0010\u0010\u001a\u00020\u000f\"\u0006\b\u0000\u0010\f\u0018\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00028\u0000H\u0086\b¢\u0006\u0004\b\u0010\u0010\u0011J0\u0010\u0013\u001a\u00028\u0000\"\u0006\b\u0000\u0010\f\u0018\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00028\u0000H\u0086\b¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00022\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015J\u001e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00182\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0002J \u0010 \u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eJ\u0016\u0010#\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u0002R\u0016\u0010$\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010&\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010%R\u0016\u0010'\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010%R\u0016\u0010(\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010%R\u0016\u0010)\u001a\u00020\t8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b+\u0010%R\u0016\u0010,\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b,\u0010%R\u0016\u0010-\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b-\u0010%R\u0016\u0010.\u001a\u00020\u001c8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00100\u001a\u00020\u001c8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b0\u0010/R\u0016\u00101\u001a\u00020\u001c8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b1\u0010/R\u0016\u00102\u001a\u00020\u001c8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b2\u0010/R\u0016\u00103\u001a\u00020\u001c8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b3\u0010/¨\u00066"}, d2 = {"Lcom/huami/watch/musicupload/fragment/MusicConstant;", "", "", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "getWifiName", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "wifiName", "getWifiPassword", "", SessionDescription.p, "randomPassword", ExifInterface.GPS_DIRECTION_TRUE, "key", "value", "", "saveKeyValue", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Object;)V", "default", "getKeyValue", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "", Constant.KEY_APP_STRINGS, "saveStringSetValue", "", "getStringSetValue", "Landroid/content/res/Resources;", "resources", "", "number", "", "shorter", "formatFileSize", "path1", "path2", "isPathEquals", "SHARED_PREFERS", "Ljava/lang/String;", "KEY_TASK_LIST", "KEY_WARNING_CONNECT_AP", "FTP_SERVER", "FTP_PORT", LogUtil.I, "FTP_USER_NAME", "FTP_PSWD", "WIFI_NAME_PRE", "WAIT_ENABLE_PHONE_WIFI_TIMEOUT", "J", "CMD_TIMEOUT", "WAIT_SCAN_RESULT_TIMEOUT", "WIFI_DISCONNECT_TIMEOUT", "WAIT_CONNECT_WIFI_TIMEOUT", "<init>", "()V", "wififtp_release"}, k = 1, mv = {1, 4, 1})
public final class MusicConstant {
    public static final long CMD_TIMEOUT = 10000;
    public static final int FTP_PORT = 5210;

    @NotNull
    public static final String FTP_PSWD = "";

    @NotNull
    public static final String FTP_SERVER = "192.168.43.1";

    @NotNull
    public static final String FTP_USER_NAME = "anonymous";

    @NotNull
    public static final MusicConstant INSTANCE = new MusicConstant();

    @NotNull
    public static final String KEY_TASK_LIST = "task_list_save";

    @NotNull
    public static final String KEY_WARNING_CONNECT_AP = "warning_connect_ap";

    @NotNull
    public static final String SHARED_PREFERS = "file_manager_configs";
    public static final long WAIT_CONNECT_WIFI_TIMEOUT = 20000;
    public static final long WAIT_ENABLE_PHONE_WIFI_TIMEOUT = 5000;
    public static final long WAIT_SCAN_RESULT_TIMEOUT = 5000;
    public static final long WIFI_DISCONNECT_TIMEOUT = 5000;

    @NotNull
    public static final String WIFI_NAME_PRE = "Music-Transfer";

    private MusicConstant() {
    }

    @NotNull
    public final String formatFileSize(@Nullable Resources resources, long number, boolean shorter) {
        String str;
        if (resources == null) {
            return "";
        }
        float f = number;
        int i = R.string.byteShort;
        float f2 = 900;
        if (f > f2) {
            i = R.string.kilobyteShort;
            f /= 1024;
        }
        if (f > f2) {
            i = R.string.megabyteShort;
            f /= 1024;
        }
        if (f > f2) {
            i = R.string.gigabyteShort;
            f /= 1024;
        }
        if (f > f2) {
            i = R.string.terabyteShort;
            f /= 1024;
        }
        if (f > f2) {
            i = R.string.petabyteShort;
            f /= 1024;
        }
        if (f < 1) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            str = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
        } else if (f < 10) {
            if (shorter) {
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                str = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
            } else {
                StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
                str = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
            }
        } else if (f >= 100 || shorter) {
            StringCompanionObject stringCompanionObject4 = StringCompanionObject.INSTANCE;
            str = String.format("%.0f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
        } else {
            StringCompanionObject stringCompanionObject5 = StringCompanionObject.INSTANCE;
            str = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
        }
        return resources.getString(R.string.fileSizeSuffix, str, resources.getString(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ <T> T getKeyValue(Context context, String key, T t) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(SHARED_PREFERS, 0);
        if (t instanceof String) {
            T t2 = (T) sharedPreferences.getString(key, (String) t);
            Intrinsics.reifiedOperationMarker(1, ExifInterface.GPS_DIRECTION_TRUE);
            return t2;
        }
        if (t instanceof Integer) {
            T t3 = (T) Integer.valueOf(sharedPreferences.getInt(key, ((Number) t).intValue()));
            Intrinsics.reifiedOperationMarker(1, ExifInterface.GPS_DIRECTION_TRUE);
            return t3;
        }
        if (t instanceof Long) {
            T t4 = (T) Long.valueOf(sharedPreferences.getLong(key, ((Number) t).longValue()));
            Intrinsics.reifiedOperationMarker(1, ExifInterface.GPS_DIRECTION_TRUE);
            return t4;
        }
        if (t instanceof Float) {
            T t5 = (T) Float.valueOf(sharedPreferences.getFloat(key, ((Number) t).floatValue()));
            Intrinsics.reifiedOperationMarker(1, ExifInterface.GPS_DIRECTION_TRUE);
            return t5;
        }
        if (!(t instanceof Boolean)) {
            return t;
        }
        T t6 = (T) Boolean.valueOf(sharedPreferences.getBoolean(key, ((Boolean) t).booleanValue()));
        Intrinsics.reifiedOperationMarker(1, ExifInterface.GPS_DIRECTION_TRUE);
        return t6;
    }

    @Nullable
    public final Set<String> getStringSetValue(@NotNull Context context, @NotNull String key) {
        return context.getSharedPreferences(SHARED_PREFERS, 0).getStringSet(key, null);
    }

    @NotNull
    public final String getWifiName(@Nullable String address) {
        if (address == null) {
            return WIFI_NAME_PRE;
        }
        return "Music-Transfer-" + StringsKt___StringsKt.takeLast(address, 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final String getWifiPassword(@NotNull Context context, @NotNull String wifiName) {
        String string = context.getSharedPreferences(SHARED_PREFERS, 0).getString(wifiName, "");
        Objects.requireNonNull(string, "null cannot be cast to non-null type kotlin.String");
        if (string.length() == 0) {
            string = randomPassword(8);
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(SHARED_PREFERS, 0).edit();
            if (string instanceof String) {
                editorEdit.putString(wifiName, string);
            } else if (string instanceof Boolean) {
                editorEdit.putBoolean(wifiName, ((Boolean) string).booleanValue());
            } else if (string instanceof Integer) {
                editorEdit.putInt(wifiName, ((Number) string).intValue());
            } else if (string instanceof Long) {
                editorEdit.putLong(wifiName, ((Number) string).longValue());
            } else if (string instanceof Float) {
                editorEdit.putFloat(wifiName, ((Number) string).floatValue());
            }
            editorEdit.apply();
        }
        return string;
    }

    public final boolean isPathEquals(@NotNull String path1, @NotNull String path2) {
        String str = File.separator;
        return Intrinsics.areEqual(StringsKt__StringsKt.removePrefix(StringsKt__StringsKt.removeSuffix(path1, (CharSequence) str), (CharSequence) str), StringsKt__StringsKt.removePrefix(StringsKt__StringsKt.removeSuffix(path2, (CharSequence) str), (CharSequence) str));
    }

    @NotNull
    public final String randomPassword(int length) {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        int i = 0;
        while (i < length) {
            i++;
            sb.append(random.nextInt(10));
        }
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ <T> void saveKeyValue(Context context, String key, T value) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(SHARED_PREFERS, 0).edit();
        if (value instanceof String) {
            editorEdit.putString(key, (String) value);
        } else if (value instanceof Boolean) {
            editorEdit.putBoolean(key, ((Boolean) value).booleanValue());
        } else if (value instanceof Integer) {
            editorEdit.putInt(key, ((Number) value).intValue());
        } else if (value instanceof Long) {
            editorEdit.putLong(key, ((Number) value).longValue());
        } else if (value instanceof Float) {
            editorEdit.putFloat(key, ((Number) value).floatValue());
        }
        editorEdit.apply();
    }

    public final void saveStringSetValue(@NotNull Context context, @NotNull String key, @NotNull Set<String> strings) {
        context.getSharedPreferences(SHARED_PREFERS, 0).edit().putStringSet(key, strings).apply();
    }
}
