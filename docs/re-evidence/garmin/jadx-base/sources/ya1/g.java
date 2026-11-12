package ya1;

import android.content.Context;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.view.DottedSeekBar;
import org.joda.time.DateTimeConstants;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p008y1.y0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000bB+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lya1/g;", "", "Landroid/view/View;", "rootView", "", "effortLevel", "Lkotlin/Function1;", "", "effortLevelChangeListener", "<init>", "(Landroid/view/View;FLe23/l;)V", "b", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f195552i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.l<Float, Unit> f195553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f195554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f195555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f195556d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final DottedSeekBar f195557e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f195558f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f195559g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final oi0.h f195560h;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"ya1/g$a", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements SeekBar.OnSeekBarChangeListener {
        public a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onProgressChanged(SeekBar seekBar, int i14, boolean z14) {
            seekBar.getClass();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStartTrackingTouch(SeekBar seekBar) {
            seekBar.getClass();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStopTrackingTouch(SeekBar seekBar) {
            seekBar.getClass();
            g gVar = g.this;
            DottedSeekBar dottedSeekBar = gVar.f195557e;
            e23.l<Float, Unit> lVar = gVar.f195553a;
            if (dottedSeekBar.getProgress() >= 1) {
                lVar.invoke(Float.valueOf(seekBar.getProgress() / 20.0f));
            } else {
                gVar.f195557e.setProgress(1);
                lVar.invoke(Float.valueOf(0.05f));
            }
        }
    }

    static {
        new b(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(View view2, float f14, e23.l<? super Float, Unit> lVar) {
        view2.getClass();
        lVar.getClass();
        this.f195553a = lVar;
        Context context = view2.getContext();
        this.f195554b = context;
        View viewFindViewById = view2.findViewById(R.id.effort_level_reset);
        this.f195555c = viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.effort_level_help);
        this.f195556d = viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.effort_level_seek_bar);
        viewFindViewById3.getClass();
        DottedSeekBar dottedSeekBar = (DottedSeekBar) viewFindViewById3;
        this.f195557e = dottedSeekBar;
        this.f195558f = (TextView) view2.findViewById(R.id.estimated_completion_time);
        this.f195559g = (TextView) view2.findViewById(R.id.effort_level_message);
        context.getClass();
        this.f195560h = new oi0.h(context);
        new j23.e(0.0f, 0.0f);
        dottedSeekBar.setDotPositions(p13.x.k(0, 10, 20));
        dottedSeekBar.setProgress((int) Math.rint(f14 * 20.0f));
        dottedSeekBar.setMin(1);
        dottedSeekBar.setOnSeekBarChangeListener(new a());
        dottedSeekBar.setContentDescription(context.getString(R.string.power_guide_effort_level_title));
        String string = context.getString(R.string.lbl_effort_slider_action);
        string.getClass();
        v22.b.a(string, dottedSeekBar);
        final int i14 = 0;
        viewFindViewById.setOnClickListener(new View.OnClickListener(this) { // from class: ya1.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f195551b;

            {
                this.f195551b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i15 = i14;
                g gVar = this.f195551b;
                switch (i15) {
                    case 0:
                        int i16 = g.f195552i;
                        int iRint = (int) Math.rint(10.0f);
                        gVar.f195557e.setProgress(iRint);
                        gVar.f195553a.invoke(Float.valueOf(iRint / 20.0f));
                        break;
                    default:
                        int i17 = g.f195552i;
                        HelpActivity.a.e(HelpActivity.f36653a, gVar.f195554b, ro0.l.POWER_GUIDE_HELP, "ABOUT_EFFORT_LEVEL_ACTION", null, 8);
                        break;
                }
            }
        });
        final int i15 = 1;
        viewFindViewById2.setOnClickListener(new View.OnClickListener(this) { // from class: ya1.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f195551b;

            {
                this.f195551b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i16 = i15;
                g gVar = this.f195551b;
                switch (i16) {
                    case 0:
                        int i17 = g.f195552i;
                        int iRint = (int) Math.rint(10.0f);
                        gVar.f195557e.setProgress(iRint);
                        gVar.f195553a.invoke(Float.valueOf(iRint / 20.0f));
                        break;
                    default:
                        int i18 = g.f195552i;
                        HelpActivity.a.e(HelpActivity.f36653a, gVar.f195554b, ro0.l.POWER_GUIDE_HELP, "ABOUT_EFFORT_LEVEL_ACTION", null, 8);
                        break;
                }
            }
        });
        a(new j23.e(0.0f, 0.0f));
        b(0);
    }

    public final void a(j23.e eVar) {
        Context context = this.f195554b;
        context.getClass();
        String string = context.getString(R.string.lbl_estimated_completion_time, sa1.h.a(context, eVar));
        TextView textView = this.f195558f;
        textView.setText(string);
        l3.a aVar = l3.f23124b;
        float f14 = eVar.f96789a;
        float fFloatValue = Float.valueOf(f14).floatValue();
        float f15 = DateTimeConstants.SECONDS_PER_HOUR;
        aVar.getClass();
        int i14 = ((int) (fFloatValue * f15)) / DateTimeConstants.SECONDS_PER_HOUR;
        float f16 = eVar.f96790b;
        int iFloatValue = ((int) (Float.valueOf(f16).floatValue() * f15)) / DateTimeConstants.SECONDS_PER_HOUR;
        if ((i14 >= 1 || iFloatValue > 1) && ((long) (Float.valueOf(f16).floatValue() * f15)) >= 5400) {
            int iFloatValue2 = (int) (Float.valueOf(f14).floatValue() * f15);
            oi0.h hVar = this.f195560h;
            String string2 = context.getString(R.string.lbl_value1_to_value2, hVar.c(iFloatValue2, false), hVar.c((int) (Float.valueOf(f16).floatValue() * f15), false));
            string2.getClass();
            textView.setContentDescription(context.getString(R.string.power_guide_estimated_time_lbl, string2));
        }
    }

    public final void b(int i14) {
        String string = this.f195554b.getString(R.string.power_guide_effort_level_message, androidx.core.view.j.f(i14, "%"));
        TextView textView = this.f195559g;
        textView.setText(string);
        v22.d.d(textView, new y0(29));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lya1/g$b;", "", "<init>", "()V", "", "EFFORT_LEVEL_MIN_VALUE", "I", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
