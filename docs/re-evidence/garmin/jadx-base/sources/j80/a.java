package j80;

import android.widget.TextView;
import androidx.core.view.j;
import com.garmin.android.apps.connectmobile.developer.realtimedata.TestRealTimeDataActivity;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f97700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TestRealTimeDataActivity f97701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f97702c;

    public /* synthetic */ a(TestRealTimeDataActivity testRealTimeDataActivity, int i14, int i15) {
        this.f97700a = i15;
        this.f97701b = testRealTimeDataActivity;
        this.f97702c = i14;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f97700a) {
            case 0:
                TextView textView = this.f97701b.f33678h;
                int i14 = this.f97702c;
                textView.setText(i14 != -1 ? j.f(i14, "") : "-");
                break;
            case 1:
                TextView textView2 = this.f97701b.f33674d;
                int i15 = this.f97702c;
                textView2.setText(i15 != -1 ? j.f(i15, "") : "-");
                break;
            case 2:
                TextView textView3 = this.f97701b.f33675e;
                int i16 = this.f97702c;
                textView3.setText(i16 != -1 ? j.f(i16, "") : "-");
                break;
            case 3:
                TextView textView4 = this.f97701b.f33676f;
                int i17 = this.f97702c;
                textView4.setText(i17 != -1 ? j.f(i17, "") : "-");
                break;
            case 4:
                TextView textView5 = this.f97701b.f33677g;
                int i18 = this.f97702c;
                textView5.setText(i18 != -1 ? j.f(i18, "") : "-");
                break;
            case 5:
                TextView textView6 = this.f97701b.f33683m;
                int i19 = this.f97702c;
                textView6.setText(i19 != -1 ? j.f(i19, "") : "-");
                break;
            case 6:
                TextView textView7 = this.f97701b.f33684n;
                int i24 = this.f97702c;
                textView7.setText(i24 != -1 ? j.f(i24, "") : "-");
                break;
            case 7:
                TextView textView8 = this.f97701b.f33685o;
                int i25 = this.f97702c;
                textView8.setText(i25 != -1 ? j.f(i25, "") : "-");
                break;
            case 8:
                TextView textView9 = this.f97701b.f33679i;
                int i26 = this.f97702c;
                textView9.setText(i26 != -1 ? j.f(i26, "") : "-");
                break;
            case 9:
                TextView textView10 = this.f97701b.f33681k;
                int i27 = this.f97702c;
                textView10.setText(i27 != -1 ? j.f(i27, "") : "-");
                break;
            case 10:
                TextView textView11 = this.f97701b.f33682l;
                int i28 = this.f97702c;
                textView11.setText(i28 != -1 ? j.f(i28, "") : "-");
                break;
            case 11:
                TextView textView12 = this.f97701b.f33686p;
                int i29 = this.f97702c;
                textView12.setText(i29 != -1 ? j.f(i29, "") : "-");
                break;
            case 12:
                TextView textView13 = this.f97701b.f33687q;
                int i30 = this.f97702c;
                textView13.setText(i30 != -1 ? j.f(i30, "") : "-");
                break;
            case 13:
                TextView textView14 = this.f97701b.f33688r;
                int i34 = this.f97702c;
                textView14.setText(i34 != -1 ? j.f(i34, "") : "-");
                break;
            case 14:
                TextView textView15 = this.f97701b.f33689t;
                int i35 = this.f97702c;
                textView15.setText(i35 != -1 ? j.f(i35, "") : "-");
                break;
            default:
                TextView textView16 = this.f97701b.f33690v;
                int i36 = this.f97702c;
                textView16.setText(i36 != -1 ? j.f(i36, "") : "-");
                break;
        }
    }
}
