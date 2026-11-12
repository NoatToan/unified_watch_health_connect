package com.garmin.android.apps.connectmobile.activities.ui;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.appcompat.widget.t;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import cr.y;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import sr.r;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0011B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/ui/RPESeekBar;", "Landroidx/appcompat/widget/t;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "rpe", "", "setRPE", "(I)V", "Lcom/garmin/android/apps/connectmobile/activities/ui/RPESeekBar$b;", "l", "setOnRPEChangeListener", "(Lcom/garmin/android/apps/connectmobile/activities/ui/RPESeekBar$b;)V", "b", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class RPESeekBar extends t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f29963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y f29964c;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/activities/ui/RPESeekBar$a", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements SeekBar.OnSeekBarChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f29965a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ RPESeekBar f29966b;

        public a(Context context, RPESeekBar rPESeekBar) {
            this.f29965a = context;
            this.f29966b = rPESeekBar;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onProgressChanged(SeekBar seekBar, int i14, boolean z14) {
            LinearGradient linearGradient;
            int i15 = i14 * 10;
            Context context = this.f29965a;
            new r(new l22.a(context));
            int color = a7.b.getColor(context, r.b(i15));
            RPESeekBar rPESeekBar = this.f29966b;
            rPESeekBar.getThumb().setColorFilter(color, PorterDuff.Mode.SRC_IN);
            y yVar = rPESeekBar.f29964c;
            boolean z15 = i15 > 0;
            if (yVar.f55315h != z15) {
                yVar.f55315h = z15;
                yVar.f55309b.setColor(a7.b.getColor(yVar.f55308a, z15 ? R.color.gcm_rpe_seek_bar_dot_color_selected : R.color.gcm_rpe_seek_bar_dot_color_unselected));
                Paint paint = yVar.f55310c;
                if (!yVar.f55315h || (linearGradient = yVar.f55314g) == null) {
                    paint.setShader(null);
                    paint.setColor(yVar.f55311d);
                } else {
                    paint.setShader(linearGradient);
                }
                yVar.invalidateSelf();
            }
            b bVar = rPESeekBar.f29963b;
            if (bVar != null) {
                bVar.a(i15);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    public interface b {
        void a(int i14);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RPESeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        y yVar = new y(context);
        this.f29964c = yVar;
        setThumb(a7.b.getDrawable(context, R.drawable.seek_bar_thumb_white));
        setOnSeekBarChangeListener(new a(context, this));
        setProgressDrawable(yVar);
        setMax(10);
    }

    public final void setOnRPEChangeListener(b l14) {
        this.f29963b = l14;
    }

    public final void setRPE(int rpe) {
        setProgress(rpe / 10);
    }

    public /* synthetic */ RPESeekBar(Context context, AttributeSet attributeSet, int i14, j jVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet);
    }
}
