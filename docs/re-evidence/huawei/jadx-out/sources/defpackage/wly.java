package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.numberpicker.HealthNumberPicker;
import com.huawei.ui.main.R;

/* JADX INFO: loaded from: classes19.dex */
public class wly extends BaseDialog {
    public wly(Context context, int i) {
        super(context, i);
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Handler f52165a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f52166b;
        private HealthTextView d;
        private Context e;
        private int i;
        private HealthNumberPicker g = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String[] f52167c = null;

        public d(Context context, Handler handler, int i) {
            this.e = context;
            this.f52165a = handler;
            this.f52166b = i;
        }

        public wly c(final int[] iArr, Integer num) {
            if (iArr == null || iArr.length == 0) {
                return null;
            }
            this.f52167c = new String[iArr.length];
            this.i = num.intValue();
            d(iArr);
            LayoutInflater layoutInflater = (LayoutInflater) this.e.getSystemService("layout_inflater");
            final wly wlyVar = new wly(this.e, R.style.heart_rate_dialog);
            View viewInflate = layoutInflater.inflate(R.layout.dialog_heart_rate_zone_setting_upper_limit, (ViewGroup) null);
            this.g = (HealthNumberPicker) viewInflate.findViewById(R.id.wheelviewselayout);
            this.d = (HealthTextView) viewInflate.findViewById(R.id.heart_picker_title);
            a(iArr, viewInflate, wlyVar);
            ((HealthButton) viewInflate.findViewById(R.id.btn_ok)).setOnClickListener(new View.OnClickListener() { // from class: wly.d.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (wlyVar != null) {
                        Message messageObtain = Message.obtain();
                        messageObtain.what = d.this.f52166b;
                        int value = d.this.g.getValue();
                        if (value >= 0) {
                            int[] iArr2 = iArr;
                            if (value < iArr2.length) {
                                messageObtain.arg1 = iArr2[value];
                            }
                        }
                        d.this.f52165a.sendMessage(messageObtain);
                        wlyVar.dismiss();
                    }
                }
            });
            wlyVar.addContentView(viewInflate, new ViewGroup.LayoutParams(-1, -2));
            wlyVar.setContentView(viewInflate);
            Window window = wlyVar.getWindow();
            window.setGravity(80);
            WindowManager.LayoutParams attributes = window.getAttributes();
            Display defaultDisplay = ((WindowManager) this.e.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR)).getDefaultDisplay();
            attributes.y = this.e.getResources().getDimensionPixelSize(R.dimen.dialogMarginBottom);
            int dimensionPixelSize = this.e.getResources().getDimensionPixelSize(R.dimen.dialogMarginStart);
            int dimensionPixelSize2 = this.e.getResources().getDimensionPixelSize(R.dimen.dialogMarginEnd);
            Pair<Integer, Integer> safeRegionWidth = BaseActivity.getSafeRegionWidth();
            attributes.width = (((defaultDisplay.getWidth() - dimensionPixelSize) - dimensionPixelSize2) - ((Integer) safeRegionWidth.first).intValue()) - ((Integer) safeRegionWidth.second).intValue();
            window.setAttributes(attributes);
            window.setWindowAnimations(R.style.track_dialog_anim);
            return wlyVar;
        }

        private void a(int[] iArr, View view, final wly wlyVar) {
            this.g.setDisplayedValues(this.f52167c);
            this.g.setMinValue(0);
            this.g.setMaxValue(iArr.length - 1);
            this.g.setWrapSelectorWheel(false);
            this.g.setValue(b(this.i, iArr));
            ((HealthButton) view.findViewById(R.id.btn_cancel)).setOnClickListener(new View.OnClickListener() { // from class: wly.d.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    wlyVar.dismiss();
                }
            });
        }

        private void d(int[] iArr) {
            if (iArr == null || this.e == null) {
                return;
            }
            for (int i = 0; i < iArr.length; i++) {
                this.f52167c[i] = this.e.getResources().getQuantityString(R.plurals.IDS_hwh_heart_rate_unit, 1, Integer.valueOf(iArr[i]));
            }
        }

        private int b(int i, int[] iArr) {
            if (iArr == null) {
                return 2;
            }
            int length = iArr.length / 2;
            for (int i2 = 0; i2 < iArr.length; i2++) {
                if (iArr[i2] == i) {
                    return i2;
                }
            }
            return length;
        }

        public void e(String str) {
            this.d.setText(str);
        }
    }
}
