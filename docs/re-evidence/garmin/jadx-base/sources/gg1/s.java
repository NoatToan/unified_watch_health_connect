package gg1;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.apps.connectmobile.settings.GCMUserSettingsActivity;
import com.garmin.android.apps.connectmobile.settings.model.StepLengthDTO;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class s implements androidx.lifecycle.z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f77308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GCMUserSettingsActivity f77309b;

    public /* synthetic */ s(GCMUserSettingsActivity gCMUserSettingsActivity, int i14) {
        this.f77308a = i14;
        this.f77309b = gCMUserSettingsActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.z0
    public final void onChanged(Object obj) {
        int i14 = this.f77308a;
        int i15 = 0;
        GCMUserSettingsActivity gCMUserSettingsActivity = this.f77309b;
        g3 g3Var = (g3) obj;
        switch (i14) {
            case 0:
                int i16 = GCMUserSettingsActivity.f41539t;
                int i17 = GCMUserSettingsActivity.e.f41562a[g3Var.f35300a.ordinal()];
                if (i17 == 2) {
                    int i18 = gCMUserSettingsActivity.f41541b - 1;
                    gCMUserSettingsActivity.f41541b = i18;
                    if (i18 == 0) {
                        gCMUserSettingsActivity.hideProgressOverlay();
                        gCMUserSettingsActivity.finish();
                    }
                    break;
                } else if (i17 == 3) {
                    i2.f(a2.SETTINGS, "GCMUserSettingsActivity", "Error deleting Custom Walking Step Length to GC [" + g3Var.f35302c + "].");
                    Toast.makeText(gCMUserSettingsActivity, R.string.txt_error_occurred, 0).show();
                    int i19 = gCMUserSettingsActivity.f41541b - 1;
                    gCMUserSettingsActivity.f41541b = i19;
                    if (i19 == 0) {
                        gCMUserSettingsActivity.hideProgressOverlay();
                        gCMUserSettingsActivity.finish();
                    }
                    break;
                }
                break;
            case 1:
                int i24 = GCMUserSettingsActivity.f41539t;
                int i25 = GCMUserSettingsActivity.e.f41562a[g3Var.f35300a.ordinal()];
                if (i25 == 1) {
                    gCMUserSettingsActivity.showProgressOverlay();
                    break;
                } else if (i25 == 2) {
                    int i26 = gCMUserSettingsActivity.f41541b - 1;
                    gCMUserSettingsActivity.f41541b = i26;
                    if (i26 == 0) {
                        gCMUserSettingsActivity.hideProgressOverlay();
                        gCMUserSettingsActivity.finish();
                    }
                    break;
                } else if (i25 == 3) {
                    i2.f(a2.SETTINGS, "GCMUserSettingsActivity", "Error saving Custom Walking Step Length to GC [" + g3Var.f35302c + "].");
                    Toast.makeText(gCMUserSettingsActivity, R.string.txt_error_occurred, 0).show();
                    int i27 = gCMUserSettingsActivity.f41541b - 1;
                    gCMUserSettingsActivity.f41541b = i27;
                    if (i27 == 0) {
                        gCMUserSettingsActivity.hideProgressOverlay();
                        gCMUserSettingsActivity.finish();
                    }
                    break;
                }
                break;
            case 2:
                int i28 = GCMUserSettingsActivity.f41539t;
                int i29 = GCMUserSettingsActivity.e.f41562a[g3Var.f35300a.ordinal()];
                if (i29 == 1) {
                    gCMUserSettingsActivity.showProgressOverlay();
                    break;
                } else if (i29 == 2) {
                    int i30 = gCMUserSettingsActivity.f41541b - 1;
                    gCMUserSettingsActivity.f41541b = i30;
                    if (i30 == 0) {
                        gCMUserSettingsActivity.hideProgressOverlay();
                        gCMUserSettingsActivity.finish();
                    }
                    break;
                } else if (i29 == 3) {
                    i2.f(a2.SETTINGS, "GCMUserSettingsActivity", "Error saving Custom Running Step Length to GC [" + g3Var.f35302c + "].");
                    Toast.makeText(gCMUserSettingsActivity, R.string.txt_error_occurred, 0).show();
                    int i34 = gCMUserSettingsActivity.f41541b - 1;
                    gCMUserSettingsActivity.f41541b = i34;
                    if (i34 == 0) {
                        gCMUserSettingsActivity.hideProgressOverlay();
                        gCMUserSettingsActivity.finish();
                    }
                    break;
                }
                break;
            case 3:
                int i35 = GCMUserSettingsActivity.f41539t;
                int i36 = GCMUserSettingsActivity.e.f41562a[g3Var.f35300a.ordinal()];
                if (i36 == 1) {
                    gCMUserSettingsActivity.showProgressOverlay();
                    break;
                } else if (i36 == 2) {
                    int i37 = gCMUserSettingsActivity.f41541b - 1;
                    gCMUserSettingsActivity.f41541b = i37;
                    if (i37 == 0) {
                        gCMUserSettingsActivity.hideProgressOverlay();
                        gCMUserSettingsActivity.finish();
                    }
                    break;
                } else if (i36 == 3) {
                    i2.f(a2.SETTINGS, "GCMUserSettingsActivity", "Error saving Custom Wheelchair Push Length to GC [" + g3Var.f35302c + "].");
                    Toast.makeText(gCMUserSettingsActivity, R.string.txt_error_occurred, 0).show();
                    int i38 = gCMUserSettingsActivity.f41541b - 1;
                    gCMUserSettingsActivity.f41541b = i38;
                    if (i38 == 0) {
                        gCMUserSettingsActivity.hideProgressOverlay();
                        gCMUserSettingsActivity.finish();
                    }
                    break;
                }
                break;
            case 4:
                int i39 = GCMUserSettingsActivity.f41539t;
                gCMUserSettingsActivity.f41547h = (wi1.i) g3Var.f35301b;
                int i44 = GCMUserSettingsActivity.e.f41562a[g3Var.f35300a.ordinal()];
                if (i44 == 2) {
                    if (gCMUserSettingsActivity.f41547h != null) {
                        z0 z0VarA = z0.a();
                        wi1.i iVar = gCMUserSettingsActivity.f41547h;
                        z0VarA.getClass();
                        if (iVar != null) {
                            SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(gCMUserSettingsActivity).edit();
                            double distance = iVar.h() ? 0.0d : iVar.getDistance();
                            editorEdit.putFloat(gCMUserSettingsActivity.getString(R.string.key_wheelchair_measured_distance), (float) distance);
                            GCMSettingManager.Q(distance);
                            double pushLength = iVar.h() ? 0.0d : iVar.getPushLength();
                            editorEdit.putString(gCMUserSettingsActivity.getString(R.string.key_wheelchair_stroke_length), String.valueOf(pushLength));
                            GCMSettingManager.P((float) pushLength);
                            int iIntValue = iVar.h() ? 0 : iVar.getPushes().intValue();
                            editorEdit.putString(gCMUserSettingsActivity.getString(R.string.key_wheelchair_total_pushes), String.valueOf(iIntValue));
                            GCMSettingManager.S(iIntValue);
                            if (TextUtils.isEmpty(iVar.getUnitKey())) {
                                o0 o0VarG = ((f12.l) KoinJavaComponent.get(f12.l.class)).g();
                                if (o0VarG != o0.STATUTE_US && o0VarG != o0.STATUTE_UK) {
                                    i15 = 1;
                                }
                                editorEdit.putInt(gCMUserSettingsActivity.getString(R.string.key_wheelchair_measured_distance_unit), i15);
                                GCMSettingManager.R(i15);
                            } else {
                                int i45 = !iVar.i() ? 1 : 0;
                                editorEdit.putInt(gCMUserSettingsActivity.getString(R.string.key_wheelchair_measured_distance_unit), i45);
                                GCMSettingManager.R(i45);
                            }
                            editorEdit.putString(gCMUserSettingsActivity.getString(R.string.key_device_wheelchair_switch_value), TextUtils.isEmpty("PUSHING") ? gCMUserSettingsActivity.getString(R.string.lbl_off) : "PUSHING");
                            editorEdit.putBoolean(gCMUserSettingsActivity.getString(R.string.key_pushing_stroke_custom_switch_key), !TextUtils.isEmpty("PUSHING"));
                            editorEdit.apply();
                        }
                        int i46 = gCMUserSettingsActivity.f41540a - 1;
                        gCMUserSettingsActivity.f41540a = i46;
                        if (i46 == 0) {
                            gCMUserSettingsActivity.fa();
                            gCMUserSettingsActivity.hideProgressOverlay();
                        }
                    } else {
                        Toast.makeText(gCMUserSettingsActivity, R.string.txt_error_occurred, 0).show();
                    }
                    break;
                } else if (i44 == 3) {
                    i2.f(a2.SETTINGS, "GCMUserSettingsActivity", "Error getting Custom Wheelchair Push Length to GC [" + g3Var.f35303d + "].");
                    Toast.makeText(gCMUserSettingsActivity, R.string.txt_error_occurred, 0).show();
                    int i47 = gCMUserSettingsActivity.f41540a - 1;
                    gCMUserSettingsActivity.f41540a = i47;
                    if (i47 == 0) {
                        gCMUserSettingsActivity.fa();
                        gCMUserSettingsActivity.hideProgressOverlay();
                    }
                    break;
                }
                break;
            case 5:
                int i48 = GCMUserSettingsActivity.f41539t;
                int i49 = GCMUserSettingsActivity.e.f41562a[g3Var.f35300a.ordinal()];
                if (i49 == 2 || i49 == 3) {
                    int i54 = gCMUserSettingsActivity.f41540a - 1;
                    gCMUserSettingsActivity.f41540a = i54;
                    if (i54 == 0) {
                        gCMUserSettingsActivity.fa();
                        gCMUserSettingsActivity.hideProgressOverlay();
                    }
                }
                break;
            case 6:
                int i55 = GCMUserSettingsActivity.f41539t;
                gCMUserSettingsActivity.f41545f = (StepLengthDTO) g3Var.f35301b;
                int i56 = GCMUserSettingsActivity.e.f41562a[g3Var.f35300a.ordinal()];
                if (i56 == 2) {
                    if (gCMUserSettingsActivity.f41545f != null) {
                        z0 z0VarA2 = z0.a();
                        StepLengthDTO stepLengthDTO = gCMUserSettingsActivity.f41545f;
                        z0VarA2.getClass();
                        z0.c(gCMUserSettingsActivity, stepLengthDTO);
                        int i57 = gCMUserSettingsActivity.f41540a - 1;
                        gCMUserSettingsActivity.f41540a = i57;
                        if (i57 == 0) {
                            gCMUserSettingsActivity.fa();
                            gCMUserSettingsActivity.hideProgressOverlay();
                        }
                    } else {
                        Toast.makeText(gCMUserSettingsActivity, R.string.txt_error_occurred, 0).show();
                    }
                    break;
                } else if (i56 == 3) {
                    i2.f(a2.SETTINGS, "GCMUserSettingsActivity", "Error getting Custom Walking Step Length to GC [" + g3Var.f35303d + "].");
                    Toast.makeText(gCMUserSettingsActivity, R.string.txt_error_occurred, 0).show();
                    int i58 = gCMUserSettingsActivity.f41540a - 1;
                    gCMUserSettingsActivity.f41540a = i58;
                    if (i58 == 0) {
                        gCMUserSettingsActivity.fa();
                        gCMUserSettingsActivity.hideProgressOverlay();
                    }
                    break;
                }
                break;
            default:
                int i59 = GCMUserSettingsActivity.f41539t;
                gCMUserSettingsActivity.f41546g = (StepLengthDTO) g3Var.f35301b;
                int i64 = GCMUserSettingsActivity.e.f41562a[g3Var.f35300a.ordinal()];
                if (i64 == 2) {
                    if (gCMUserSettingsActivity.f41546g != null) {
                        z0 z0VarA3 = z0.a();
                        StepLengthDTO stepLengthDTO2 = gCMUserSettingsActivity.f41546g;
                        z0VarA3.getClass();
                        z0.b(gCMUserSettingsActivity, stepLengthDTO2);
                        int i65 = gCMUserSettingsActivity.f41540a - 1;
                        gCMUserSettingsActivity.f41540a = i65;
                        if (i65 == 0) {
                            gCMUserSettingsActivity.fa();
                            gCMUserSettingsActivity.hideProgressOverlay();
                        }
                    } else {
                        Toast.makeText(gCMUserSettingsActivity, R.string.txt_error_occurred, 0).show();
                    }
                    break;
                } else if (i64 == 3) {
                    i2.f(a2.SETTINGS, "GCMUserSettingsActivity", "Error getting Custom Walking Step Length to GC [" + g3Var.f35303d + "].");
                    Toast.makeText(gCMUserSettingsActivity, R.string.txt_error_occurred, 0).show();
                    int i66 = gCMUserSettingsActivity.f41540a - 1;
                    gCMUserSettingsActivity.f41540a = i66;
                    if (i66 == 0) {
                        gCMUserSettingsActivity.fa();
                        gCMUserSettingsActivity.hideProgressOverlay();
                    }
                    break;
                }
                break;
        }
    }
}
