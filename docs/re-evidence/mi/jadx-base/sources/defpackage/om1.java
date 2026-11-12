package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.provider.Settings;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class om1 {
    public static final om1 c = new om1(new int[]{2}, 8);
    public static final om1 d = new om1(new int[]{2, 5, 6}, 8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f29284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f29285b;

    public om1(int[] iArr, int i) {
        if (iArr != null) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.f29284a = iArrCopyOf;
            Arrays.sort(iArrCopyOf);
        } else {
            this.f29284a = new int[0];
        }
        this.f29285b = i;
    }

    public static boolean a() {
        if (wlq.f38110a >= 17) {
            String str = wlq.c;
            if ("Amazon".equals(str) || "Xiaomi".equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static om1 b(Context context) {
        return c(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    @SuppressLint({"InlinedApi"})
    public static om1 c(Context context, Intent intent) {
        if (a() && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
            return d;
        }
        return (intent == null || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0) ? c : new om1(intent.getIntArrayExtra("android.media.extra.ENCODINGS"), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8));
    }

    public int d() {
        return this.f29285b;
    }

    public boolean e(int i) {
        return Arrays.binarySearch(this.f29284a, i) >= 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof om1)) {
            return false;
        }
        om1 om1Var = (om1) obj;
        return Arrays.equals(this.f29284a, om1Var.f29284a) && this.f29285b == om1Var.f29285b;
    }

    public int hashCode() {
        return this.f29285b + (Arrays.hashCode(this.f29284a) * 31);
    }

    public String toString() {
        int i = this.f29285b;
        String string = Arrays.toString(this.f29284a);
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 67);
        sb.append("AudioCapabilities[maxChannelCount=");
        sb.append(i);
        sb.append(", supportedEncodings=");
        sb.append(string);
        sb.append("]");
        return sb.toString();
    }
}
