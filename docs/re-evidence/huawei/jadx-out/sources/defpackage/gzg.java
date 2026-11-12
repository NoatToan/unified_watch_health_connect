package defpackage;

import com.huawei.health.servicesui.R;

/* JADX INFO: loaded from: classes8.dex */
public class gzg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f36270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String[] f36271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int[] f36272c;
    private String[] d;
    private String[] e;
    private String[] i = btx.c().getResources().getStringArray(R.array.sug_run_workout_names);

    public gzg(int i) {
        if (i == 0 || i == 1) {
            this.d = btx.c().getResources().getStringArray(R.array.sug_5km_10km_workout_desc_km);
            this.f36270a = btx.c().getResources().getIntArray(R.array.sug_5km_10km_workout_desc_3);
            this.f36272c = btx.c().getResources().getIntArray(R.array.sug_5km_10km_workout_desc_4);
            this.f36271b = btx.c().getResources().getStringArray(R.array.sug_5km_10km_week_name);
            this.e = btx.c().getResources().getStringArray(R.array.sug_5km_10km_week_sentence);
            return;
        }
        this.d = btx.c().getResources().getStringArray(R.array.sug_mathon_workout_desc_km);
        this.f36270a = btx.c().getResources().getIntArray(R.array.sug_mathon_workout_desc_3);
        this.f36272c = btx.c().getResources().getIntArray(R.array.sug_mathon_workout_desc_4);
        this.f36271b = btx.c().getResources().getStringArray(R.array.sug_marathon_week_name);
        this.e = btx.c().getResources().getStringArray(R.array.sug_marathon_week_sentence);
    }

    public String e(int i) {
        if (i >= 0) {
            String[] strArr = this.i;
            if (i < strArr.length) {
                return strArr[i];
            }
        }
        return String.valueOf(i);
    }

    public String d(int i) {
        if (i >= 0) {
            String[] strArr = this.d;
            if (strArr.length > i) {
                return strArr[i];
            }
        }
        return String.valueOf(i);
    }

    public int a(int i) {
        if (i >= 0) {
            int[] iArr = this.f36270a;
            if (iArr.length >= i) {
                return iArr[i];
            }
        }
        return this.f36270a[0];
    }

    public int c(int i) {
        if (i >= 0) {
            int[] iArr = this.f36272c;
            if (iArr.length >= i) {
                return iArr[i];
            }
        }
        return this.f36272c[0];
    }
}
