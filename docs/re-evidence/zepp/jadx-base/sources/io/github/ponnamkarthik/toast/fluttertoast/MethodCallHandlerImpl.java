package io.github.ponnamkarthik.toast.fluttertoast;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.app.NotificationCompat;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.android.exoplayer2.text.ttml.b;
import com.huami.moving.ui.utils.SportAnalytics;
import com.huami.tools.analytics.DbUtils;
import com.twitter.sdk.android.tweetcomposer.g;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u0012J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\t\u0010\nR\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lio/github/ponnamkarthik/toast/fluttertoast/MethodCallHandlerImpl;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "Lio/flutter/plugin/common/MethodCall;", NotificationCompat.CATEGORY_CALL, "Lio/flutter/plugin/common/MethodChannel$Result;", "result", "", "onMethodCall", "Landroid/widget/Toast;", "a", "Landroid/widget/Toast;", "mToast", "Landroid/content/Context;", "b", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", DbUtils.Const.Table.CONTEXT, "<init>", "fluttertoast_release"}, k = 1, mv = {1, 4, 0})
public final class MethodCallHandlerImpl implements MethodChannel.MethodCallHandler {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private Toast mToast;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private Context context;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            MethodCallHandlerImpl.this.mToast.show();
        }
    }

    public MethodCallHandlerImpl(@NotNull Context context) {
        this.context = context;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0093  */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(@NotNull MethodCall call, @NotNull MethodChannel.Result result) {
        int i;
        int i2;
        Drawable drawable;
        String str = call.method;
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -1913642710) {
                if (iHashCode == -1367724422 && str.equals(g.g)) {
                    Toast toast = this.mToast;
                    if (toast != null) {
                        toast.cancel();
                    }
                    result.success(Boolean.TRUE);
                    return;
                }
            } else if (str.equals("showToast")) {
                String strValueOf = String.valueOf(call.argument("msg"));
                String strValueOf2 = String.valueOf(call.argument(SessionDescription.p));
                String strValueOf3 = String.valueOf(call.argument("gravity"));
                Number number = (Number) call.argument("bgcolor");
                Number number2 = (Number) call.argument("textcolor");
                Number number3 = (Number) call.argument(b.J);
                int iHashCode2 = strValueOf3.hashCode();
                if (iHashCode2 != -1364013995) {
                    if (iHashCode2 == 115029 && strValueOf3.equals("top")) {
                        i = 48;
                    } else {
                        i = 80;
                    }
                } else if (strValueOf3.equals(b.m0)) {
                    i = 17;
                } else {
                    i = 80;
                }
                boolean zAreEqual = Intrinsics.areEqual(strValueOf2, SportAnalytics.ParamValue.PicType.LONG);
                if (number == null || (i2 = Build.VERSION.SDK_INT) >= 30) {
                    Toast toastMakeText = Toast.makeText(this.context, strValueOf, zAreEqual ? 1 : 0);
                    this.mToast = toastMakeText;
                    if (Build.VERSION.SDK_INT < 30) {
                        try {
                            View view = toastMakeText.getView();
                            if (view == null) {
                                Intrinsics.throwNpe();
                            }
                            TextView textView = (TextView) view.findViewById(android.R.id.message);
                            if (number3 != null) {
                                textView.setTextSize(number3.floatValue());
                            }
                            if (number2 != null) {
                                textView.setTextColor(number2.intValue());
                            }
                        } catch (Exception unused) {
                        }
                    }
                } else {
                    Object systemService = this.context.getSystemService("layout_inflater");
                    if (systemService == null) {
                        throw new TypeCastException("null cannot be cast to non-null type android.view.LayoutInflater");
                    }
                    View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.toast_custom, (ViewGroup) null);
                    TextView textView2 = (TextView) viewInflate.findViewById(R.id.text);
                    textView2.setText(strValueOf);
                    if (i2 >= 21) {
                        drawable = this.context.getDrawable(R.drawable.corner);
                        if (drawable == null) {
                            Intrinsics.throwNpe();
                        }
                    } else {
                        drawable = this.context.getResources().getDrawable(R.drawable.corner);
                    }
                    drawable.setColorFilter(number.intValue(), PorterDuff.Mode.SRC_IN);
                    textView2.setBackground(drawable);
                    if (number3 != null) {
                        textView2.setTextSize(number3.floatValue());
                    }
                    if (number2 != null) {
                        textView2.setTextColor(number2.intValue());
                    }
                    Toast toast2 = new Toast(this.context);
                    this.mToast = toast2;
                    toast2.setDuration(zAreEqual ? 1 : 0);
                    this.mToast.setView(viewInflate);
                }
                if (Build.VERSION.SDK_INT < 30) {
                    if (i == 17) {
                        this.mToast.setGravity(i, 0, 0);
                    } else if (i != 48) {
                        this.mToast.setGravity(i, 0, 100);
                    } else {
                        this.mToast.setGravity(i, 0, 100);
                    }
                }
                Context context = this.context;
                if (!(context instanceof Activity)) {
                    this.mToast.show();
                } else {
                    if (context == null) {
                        throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
                    }
                    ((Activity) context).runOnUiThread(new a());
                }
                result.success(Boolean.TRUE);
                return;
            }
        }
        result.notImplemented();
    }

    public final void setContext(@NotNull Context context) {
        this.context = context;
    }
}
