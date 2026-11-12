package defpackage;

import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.method.Touch;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.MotionEvent;
import android.widget.TextView;

/* JADX INFO: loaded from: classes41.dex */
public class ohh extends LinkMovementMethod {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f44317c;
    private int d;

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 1) {
            ClickableSpan[] clickableSpanArrD = d(textView, spannable, motionEvent);
            if (clickableSpanArrD.length != 0) {
                clickableSpanArrD[0].onClick(textView);
                if (this.f44317c != 0) {
                    spannable.setSpan(new ForegroundColorSpan(this.f44317c), spannable.getSpanStart(clickableSpanArrD[0]), spannable.getSpanEnd(clickableSpanArrD[0]), 33);
                }
                return true;
            }
        } else {
            if (action != 0) {
                return Touch.onTouchEvent(textView, spannable, motionEvent);
            }
            ClickableSpan[] clickableSpanArrD2 = d(textView, spannable, motionEvent);
            if (clickableSpanArrD2.length != 0) {
                if (this.d != 0) {
                    spannable.setSpan(new ForegroundColorSpan(this.d), spannable.getSpanStart(clickableSpanArrD2[0]), spannable.getSpanEnd(clickableSpanArrD2[0]), 33);
                }
                return true;
            }
        }
        Selection.removeSelection(spannable);
        Touch.onTouchEvent(textView, spannable, motionEvent);
        return false;
    }

    private ClickableSpan[] d(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int totalPaddingLeft = textView.getTotalPaddingLeft();
        int totalPaddingTop = textView.getTotalPaddingTop();
        int scrollX = textView.getScrollX();
        int scrollY = textView.getScrollY();
        Layout layout = textView.getLayout();
        int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical((y - totalPaddingTop) + scrollY), (x - totalPaddingLeft) + scrollX);
        return (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
    }

    public ohh(int i, int i2) {
        this.f44317c = i;
        this.d = i2;
    }
}
