package com.huami.watch.companion.ecg.view.voice;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.companion.ecg.R;
import com.huami.watch.companion.ecg.view.voice.SpeakingPopup;
import com.twitter.sdk.android.tweetcomposer.g;
import com.ximalaya.ting.android.opensdk.player.service.XmPlayerService;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b$\u0010%J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0002J\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\bJ\u000e\u0010\r\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eJ\u0006\u0010\u0011\u001a\u00020\u0002J\u0006\u0010\u0012\u001a\u00020\u0002R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\"\u0010#\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006&"}, d2 = {"Lcom/huami/watch/companion/ecg/view/voice/SpeakingPopup;", "", "", "b", "Landroid/view/View;", XmPlayerService.TYPE_RANK_ANCHOR, "showAsPopupWindow", "dismissPopup", "", "isShowing", g.g, "changeState", "", "countDown", "", FirebaseAnalytics.Param.LEVEL, "setVoiceLevel", "timeToShort", "overTime", "Landroid/content/Context;", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/widget/PopupWindow;", "Landroid/widget/PopupWindow;", "popupWindow", "c", "Z", "isCancel", GoogleApiAvailabilityLight.a, "J", "getLastCountDown", "()J", "setLastCountDown", "(J)V", "lastCountDown", "<init>", "(Landroid/content/Context;)V", "ecg-companion_release"}, k = 1, mv = {1, 5, 1})
public final class SpeakingPopup {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private PopupWindow popupWindow;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean isCancel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private long lastCountDown;

    public SpeakingPopup(@NotNull Context context) {
        this.context = context;
    }

    private final void b() {
        if (this.popupWindow == null) {
            View viewInflate = View.inflate(this.context, R.layout.popup_window_speak, null);
            PopupWindow popupWindow = new PopupWindow(this.context);
            this.popupWindow = popupWindow;
            popupWindow.setBackgroundDrawable(new ColorDrawable());
            PopupWindow popupWindow2 = this.popupWindow;
            popupWindow2.setFocusable(true);
            popupWindow2.setContentView(viewInflate);
            popupWindow2.setSoftInputMode(1);
            this.popupWindow.setTouchInterceptor(new View.OnTouchListener() { // from class: i77
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return SpeakingPopup.c(view, motionEvent);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(View view, MotionEvent motionEvent) {
        return true;
    }

    public final void changeState(boolean cancel) {
        this.isCancel = cancel;
        if (isShowing()) {
            View contentView = this.popupWindow.getContentView();
            ImageView imageView = (ImageView) contentView.findViewById(R.id.imv_speaking);
            TextView textView = (TextView) contentView.findViewById(R.id.tx_tip);
            VoiceAnimView voiceAnimView = (VoiceAnimView) contentView.findViewById(R.id.view_level);
            if (cancel) {
                voiceAnimView.setVisibility(8);
                imageView.setImageResource(R.drawable.ic_record_warning);
                textView.setText(R.string.release_cancel);
            } else {
                voiceAnimView.setVisibility(0);
                imageView.setImageResource(R.drawable.ic_record);
                textView.setText(R.string.move_up_cancel);
            }
        }
    }

    public final void countDown(long countDown) {
        if ((isShowing() & (!this.isCancel)) && (this.lastCountDown != countDown)) {
            this.lastCountDown = countDown;
            ((AppCompatTextView) this.popupWindow.getContentView().findViewById(R.id.tx_tip)).setText(this.context.getResources().getQuantityString(R.plurals.speak_time_left, (int) countDown, Long.valueOf(countDown)));
        }
    }

    public final void dismissPopup() {
        if (isShowing()) {
            this.popupWindow.dismiss();
        }
    }

    public final long getLastCountDown() {
        return this.lastCountDown;
    }

    public final boolean isShowing() {
        PopupWindow popupWindow = this.popupWindow;
        if (popupWindow != null) {
            return popupWindow.isShowing();
        }
        return false;
    }

    public final void overTime() {
        if (isShowing() && (!this.isCancel)) {
            ((AppCompatTextView) this.popupWindow.getContentView().findViewById(R.id.tx_tip)).setText(R.string.speak_time_over_time);
        }
    }

    public final void setLastCountDown(long j) {
        this.lastCountDown = j;
    }

    public final void setVoiceLevel(int level) {
        if (isShowing()) {
            ((VoiceAnimView) this.popupWindow.getContentView().findViewById(R.id.view_level)).setLevel(level);
        }
    }

    public final void showAsPopupWindow(@NotNull View anchor) {
        b();
        PopupWindow popupWindow = this.popupWindow;
        if (popupWindow == null) {
            return;
        }
        popupWindow.setBackgroundDrawable(new ColorDrawable(ContextCompat.getColor(this.context, android.R.color.transparent)));
        if (popupWindow.isShowing()) {
            return;
        }
        int dimensionPixelSize = this.context.getResources().getDimensionPixelSize(R.dimen.popup_size);
        DisplayMetrics displayMetrics = this.context.getResources().getDisplayMetrics();
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        popupWindow.setWidth(dimensionPixelSize);
        popupWindow.setHeight(dimensionPixelSize);
        int i3 = dimensionPixelSize / 2;
        popupWindow.showAtLocation(anchor, 0, (i / 2) - i3, (i2 / 2) - i3);
    }

    public final void timeToShort() {
        if (isShowing() && (!this.isCancel)) {
            View contentView = this.popupWindow.getContentView();
            ImageView imageView = (ImageView) contentView.findViewById(R.id.imv_speaking);
            AppCompatTextView appCompatTextView = (AppCompatTextView) contentView.findViewById(R.id.tx_tip);
            AppCompatImageView appCompatImageView = (AppCompatImageView) contentView.findViewById(R.id.view_level);
            imageView.setImageResource(R.drawable.ic_record_warning);
            appCompatTextView.setText(R.string.speak_time_too_short);
            appCompatImageView.setVisibility(8);
        }
    }
}
