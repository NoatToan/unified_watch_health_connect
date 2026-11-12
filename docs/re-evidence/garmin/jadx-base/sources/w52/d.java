package w52;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.audiorecording.AudioRecordingView;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lw52/d;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends ConstraintLayout {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f182487i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AudioRecordingView f182488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f182489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AppCompatImageView f182490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AppCompatImageView f182491d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public o62.b0 f182492e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public o62.b0 f182493f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public n00.b f182494g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public vn2.t0 f182495h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.workout_audio_note_view, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R.id.record_layout);
        viewFindViewById.getClass();
        AudioRecordingView audioRecordingView = (AudioRecordingView) viewFindViewById;
        this.f182488a = audioRecordingView;
        View viewFindViewById2 = findViewById(R.id.textview_error_message);
        viewFindViewById2.getClass();
        this.f182489b = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.icon_error_viewholder);
        viewFindViewById3.getClass();
        AppCompatImageView appCompatImageView = (AppCompatImageView) viewFindViewById3;
        this.f182490c = appCompatImageView;
        View viewFindViewById4 = findViewById(R.id.delete_audio_recording_viewholder);
        viewFindViewById4.getClass();
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) viewFindViewById4;
        this.f182491d = appCompatImageView2;
        if (c22.b.e(context)) {
            appCompatImageView.getLayoutParams().width = (int) c22.b.c(context, context.getResources().getDimensionPixelSize(R.dimen.icon_xsmall), 1.5f);
            appCompatImageView2.getLayoutParams().width = (int) c22.b.c(context, context.getResources().getDimensionPixelSize(R.dimen.icon_default), 1.5f);
        }
        appCompatImageView2.setOnClickListener(new vg1.z0(this, 7));
        audioRecordingView.setRequestPermissionListener(new c(this));
        audioRecordingView.setRemoveRecordingClickListener(new c(this));
        audioRecordingView.setFinishedRecordingListener(new c(this));
        audioRecordingView.setDownloadFileListener(new c(this));
    }

    public static void i(d dVar) {
        v22.e.v(dVar.f182488a, true);
        v22.e.v(dVar.f182489b, false);
        v22.e.v(dVar.f182490c, false);
        v22.e.v(dVar.f182491d, false);
    }

    public /* synthetic */ d(Context context, AttributeSet attributeSet, int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        this(context, (i15 & 2) != 0 ? null : attributeSet, (i15 & 4) != 0 ? 0 : i14);
    }
}
