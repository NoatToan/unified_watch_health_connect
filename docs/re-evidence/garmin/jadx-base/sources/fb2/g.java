package fb2;

import android.content.Context;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;

/* JADX INFO: loaded from: classes8.dex */
public class g {
    public static View a(Context context) {
        View view2 = new View(context);
        view2.setLayoutParams(new ViewGroup.LayoutParams(-1, (int) (context.getResources().getDimension(R.dimen.spacing_large) + 0.5f)));
        return view2;
    }

    public static GCMComplexOneLineButton b(Context context, int i14, String str, Integer num, String str2, GCMComplexOneLineButton.a aVar) {
        GCMComplexOneLineButton gCMComplexOneLineButton = new GCMComplexOneLineButton(context);
        gCMComplexOneLineButton.setId(i14);
        gCMComplexOneLineButton.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        gCMComplexOneLineButton.setButtonLeftLabel(str);
        gCMComplexOneLineButton.h();
        gCMComplexOneLineButton.e();
        if (aVar == null) {
            aVar = GCMComplexOneLineButton.a.NONE;
        }
        gCMComplexOneLineButton.setRightElement(aVar);
        if (!TextUtils.isEmpty(str2)) {
            gCMComplexOneLineButton.setButtonBottomHint(str2);
            ((ViewGroup) gCMComplexOneLineButton.getChildAt(0)).addView(a(context));
        }
        if (num != null) {
            gCMComplexOneLineButton.setLeftIcon(num.intValue());
        }
        return gCMComplexOneLineButton;
    }

    public static TextView c(Context context, String str) {
        int iE = e(10, context);
        TextView textView = new TextView(context);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        textView.setPadding(iE, iE, iE, iE);
        if (str != null) {
            textView.setText(str);
        }
        textView.setTextColor(a7.b.getColor(context, R.color.gcm_text_secondary));
        textView.setTextSize(2, 14.0f);
        return textView;
    }

    public static GCMComplexTwoLineButton d(Context context, int i14, String str, String str2) {
        GCMComplexTwoLineButton gCMComplexTwoLineButton = new GCMComplexTwoLineButton(context);
        gCMComplexTwoLineButton.setId(i14);
        gCMComplexTwoLineButton.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        gCMComplexTwoLineButton.setButtonTopLabel(str);
        gCMComplexTwoLineButton.f47790j.setVisibility(8);
        gCMComplexTwoLineButton.f47789i.setVisibility(8);
        if (!TextUtils.isEmpty(str2)) {
            gCMComplexTwoLineButton.setButtonHint(str2);
            ((ViewGroup) gCMComplexTwoLineButton.getChildAt(0)).addView(a(context));
        }
        return gCMComplexTwoLineButton;
    }

    public static int e(int i14, Context context) {
        return (int) (TypedValue.applyDimension(1, i14, context.getResources().getDisplayMetrics()) + 0.5f);
    }
}
