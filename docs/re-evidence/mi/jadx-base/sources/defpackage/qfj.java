package defpackage;

import android.annotation.TargetApi;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.core.view.c;
import androidx.room.FtsOptions;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.e;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import com.xiaomi.fitness.statistics.StatConstants;

/* JADX INFO: loaded from: classes4.dex */
@TargetApi(23)
public class qfj extends ncj implements YogaMeasureFunction {
    public EditText y;
    public jfj z;
    public int x = -1;
    public String A = null;
    public String B = null;
    public int C = -1;
    public int D = -1;

    public qfj() {
        this.h = 1;
        f();
    }

    private void f() {
        setMeasureFunction(this);
    }

    public String d() {
        return this.B;
    }

    public String e() {
        return this.A;
    }

    @Override // defpackage.pej
    public boolean isVirtualAnchor() {
        return true;
    }

    @Override // defpackage.pej
    public boolean isYogaLeafNode() {
        return true;
    }

    @Override // com.facebook.yoga.YogaMeasureFunction
    public long measure(l0s l0sVar, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
        EditText editText = (EditText) sk1.c(this.y);
        jfj jfjVar = this.z;
        if (jfjVar != null) {
            jfjVar.a(editText);
        } else {
            editText.setTextSize(0, this.f27781a.c());
            int i = this.f;
            if (i != -1) {
                editText.setLines(i);
            }
            int breakStrategy = editText.getBreakStrategy();
            int i2 = this.h;
            if (breakStrategy != i2) {
                editText.setBreakStrategy(i2);
            }
        }
        editText.setHint(d());
        editText.measure(tbf.a(f, yogaMeasureMode), tbf.a(f2, yogaMeasureMode2));
        return k0s.b(editText.getMeasuredWidth(), editText.getMeasuredHeight());
    }

    @Override // defpackage.pej
    public void onCollectExtraUpdates(e eVar) {
        super.onCollectExtraUpdates(eVar);
        if (this.x != -1) {
            eVar.K(getReactTag(), new ufj(c(this, e(), false, null), this.x, this.v, getPadding(0), getPadding(1), getPadding(2), getPadding(3), this.g, this.h, this.j, this.C, this.D));
        }
    }

    @Override // defpackage.pej, defpackage.oej
    public void setLocalData(Object obj) {
        sk1.a(obj instanceof jfj);
        this.z = (jfj) obj;
        dirty();
    }

    @iej(name = "mostRecentEventCount")
    public void setMostRecentEventCount(int i) {
        this.x = i;
    }

    @Override // defpackage.pej
    public void setPadding(int i, float f) {
        super.setPadding(i, f);
        markUpdated();
    }

    @iej(name = "placeholder")
    public void setPlaceholder(String str) {
        this.B = str;
        markUpdated();
    }

    @iej(name = "selection")
    public void setSelection(ReadableMap readableMap) {
        this.D = -1;
        this.C = -1;
        if (readableMap != null && readableMap.hasKey(StatConstants.PARAM_START) && readableMap.hasKey(StatConstants.PARAM_END)) {
            this.C = readableMap.getInt(StatConstants.PARAM_START);
            this.D = readableMap.getInt(StatConstants.PARAM_END);
            markUpdated();
        }
    }

    @iej(name = "text")
    public void setText(String str) {
        this.A = str;
        markUpdated();
    }

    @Override // defpackage.ncj
    public void setTextBreakStrategy(String str) {
        if (str == null || FtsOptions.TOKENIZER_SIMPLE.equals(str)) {
            this.h = 0;
            return;
        }
        if ("highQuality".equals(str)) {
            this.h = 1;
        } else {
            if ("balanced".equals(str)) {
                this.h = 2;
                return;
            }
            throw new JSApplicationIllegalArgumentException("Invalid textBreakStrategy: " + str);
        }
    }

    @Override // defpackage.pej, defpackage.oej
    public void setThemedContext(g9p g9pVar) {
        super.setThemedContext(g9pVar);
        boolean zG = rhh.a().g();
        float fD = rhh.a().d();
        EditText editText = new EditText(getThemedContext());
        float F = c.F(editText);
        if (zG) {
            F *= fD;
        }
        setDefaultPadding(4, F);
        float paddingTop = editText.getPaddingTop();
        if (zG) {
            paddingTop *= fD;
        }
        setDefaultPadding(1, paddingTop);
        float fE = c.E(editText);
        if (zG) {
            fE *= fD;
        }
        setDefaultPadding(5, fE);
        setDefaultPadding(3, zG ? editText.getPaddingBottom() * fD : editText.getPaddingBottom());
        this.y = editText;
        editText.setPadding(0, 0, 0, 0);
        this.y.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
    }
}
