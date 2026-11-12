package gg1;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.apps.connectmobile.settings.model.StepLengthDTO;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes10.dex */
public class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static z0 f77381a;

    private z0() {
    }

    public static synchronized z0 a() {
        try {
            if (f77381a == null) {
                f77381a = new z0();
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return f77381a;
    }

    public static void b(Context context, StepLengthDTO stepLengthDTO) {
        if (stepLengthDTO != null) {
            SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(context).edit();
            double d14 = stepLengthDTO.C() ? 0.0d : stepLengthDTO.f43519c;
            editorEdit.putFloat(context.getString(R.string.key_running_measured_distance), (float) d14);
            GCMSettingManager.F(d14);
            double d15 = stepLengthDTO.C() ? 0.0d : stepLengthDTO.f43522f;
            editorEdit.putString(context.getString(R.string.key_running_stride_length), String.valueOf(d15));
            GCMSettingManager.E((float) d15);
            int i14 = 0;
            int i15 = stepLengthDTO.C() ? 0 : (int) stepLengthDTO.f43521e;
            editorEdit.putString(context.getString(R.string.key_running_total_steps), String.valueOf(i15));
            GCMSettingManager.H(i15);
            if (TextUtils.isEmpty(stepLengthDTO.f43520d)) {
                o0 o0VarG = ((f12.l) KoinJavaComponent.get(f12.l.class)).g();
                if (o0VarG != o0.STATUTE_US && o0VarG != o0.STATUTE_UK) {
                    i14 = 1;
                }
                editorEdit.putInt(context.getString(R.string.key_running_measured_distance_unit), i14);
                GCMSettingManager.G(i14);
            } else {
                if (!TextUtils.isEmpty(stepLengthDTO.f43520d) && p005kotlin.jvm.internal.s.g(stepLengthDTO.f43520d, "foot")) {
                    i14 = 1;
                }
                int i16 = i14 ^ 1;
                editorEdit.putInt(context.getString(R.string.key_running_measured_distance_unit), i16);
                GCMSettingManager.G(i16);
            }
            String str = stepLengthDTO.f43518b;
            editorEdit.putString(context.getString(R.string.key_device_running_switch_value), TextUtils.isEmpty(str) ? context.getString(R.string.lbl_off) : str);
            editorEdit.putBoolean(context.getString(R.string.key_running_stride_custom_switch_key), !TextUtils.isEmpty(str));
            editorEdit.apply();
        }
    }

    public static void c(Context context, StepLengthDTO stepLengthDTO) {
        if (stepLengthDTO != null) {
            SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(context).edit();
            double d14 = stepLengthDTO.C() ? 0.0d : stepLengthDTO.f43519c;
            editorEdit.putFloat(context.getString(R.string.key_walking_measured_distance), (float) d14);
            GCMSettingManager.M(d14);
            double d15 = stepLengthDTO.C() ? 0.0d : stepLengthDTO.f43522f;
            editorEdit.putString(context.getString(R.string.key_walking_stride_length), String.valueOf(d15));
            GCMSettingManager.L((float) d15);
            int i14 = 0;
            int i15 = stepLengthDTO.C() ? 0 : (int) stepLengthDTO.f43521e;
            editorEdit.putString(context.getString(R.string.key_walking_total_steps), String.valueOf(i15));
            GCMSettingManager.O(i15);
            if (TextUtils.isEmpty(stepLengthDTO.f43520d)) {
                o0 o0VarG = ((f12.l) KoinJavaComponent.get(f12.l.class)).g();
                if (o0VarG != o0.STATUTE_US && o0VarG != o0.STATUTE_UK) {
                    i14 = 1;
                }
                editorEdit.putInt(context.getString(R.string.key_walking_measured_distance_unit), i14);
                GCMSettingManager.N(i14);
            } else {
                if (!TextUtils.isEmpty(stepLengthDTO.f43520d) && p005kotlin.jvm.internal.s.g(stepLengthDTO.f43520d, "foot")) {
                    i14 = 1;
                }
                int i16 = i14 ^ 1;
                editorEdit.putInt(context.getString(R.string.key_walking_measured_distance_unit), i16);
                GCMSettingManager.N(i16);
            }
            String str = stepLengthDTO.f43518b;
            editorEdit.putString(context.getString(R.string.key_device_walking_switch_value), TextUtils.isEmpty(str) ? context.getString(R.string.lbl_off) : str);
            editorEdit.putBoolean(context.getString(R.string.key_walking_stride_custom_switch_key), !TextUtils.isEmpty(str));
            editorEdit.apply();
        }
    }
}
