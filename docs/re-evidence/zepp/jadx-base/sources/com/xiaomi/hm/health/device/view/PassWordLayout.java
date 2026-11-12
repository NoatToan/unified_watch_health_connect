package com.xiaomi.hm.health.device.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.R;
import com.huami.lib.view.ViewUtils;
import com.huami.tools.analytics.DbUtils;
import com.loc.z;
import com.xiaomi.hm.health.device.view.PassWordLayout;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010!\n\u0002\b-\u0018\u00002\u00020\u0001:\u0001UB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010R\u001a\u00020\t¢\u0006\u0004\bS\u0010TJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002J\u001a\u0010\u0010\u001a\u00020\u00062\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\rJ\u000e\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\tJ\u000e\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016J\u0018\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\tH\u0014J\u000e\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u000eJ\u0006\u0010\u001e\u001a\u00020\u0006J\u0006\u0010\u001f\u001a\u00020\u0006J\u0006\u0010!\u001a\u00020 J\u0006\u0010\"\u001a\u00020\u0006J\u000e\u0010\"\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tJ\u001e\u0010%\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020\u000eR\u0016\u0010\u0014\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010(\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010'R\u001c\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000e0)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010*R\"\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00103\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00106\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00108\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010'R\u0016\u0010:\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010'R\u0016\u0010<\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010'R\u0016\u0010>\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010'R\u0016\u0010@\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010'R\u0016\u0010B\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010'R\u0016\u0010D\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010'R\u0016\u0010F\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010'R\u0016\u0010H\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010'R\u0016\u0010J\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010'R\u0016\u0010L\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010'R\u0016\u0010N\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u00105R\u0013\u0010Q\u001a\u00020\u000e8F@\u0006¢\u0006\u0006\u001a\u0004\bO\u0010P¨\u0006V"}, d2 = {"Lcom/xiaomi/hm/health/device/view/PassWordLayout;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "c", "b", "", "index", "setNextInput", "setPreviosInput", "", "", "keyValue", "setPasswordKeyValue", "Lcom/xiaomi/hm/health/device/view/PassWordLayout$PwdChangeListener;", "pwdChangeListener", "setPwdChangeListener", "maxLength", "setMaxLength", "", "size", "setTextSize", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "pwd", "addPwd", "removePwd", "removeAllPwd", "", "toggleClearText", "startInput", "isInput", "txt", "setNoInput", "a", LogUtil.I, "inputIndex", "", "Ljava/util/List;", "mPassList", GoogleApiAvailabilityLight.a, "Ljava/util/Map;", "keyValueMap", "e", "Lcom/xiaomi/hm/health/device/view/PassWordLayout$PwdChangeListener;", "f", "Landroid/content/Context;", "mContext", "g", "Z", "mIsShowInputLine", "h", "mInputColor", "i", "mNoinputColor", z.j, "mLineColor", hl.k, "mTxtInputColor", "l", "mDrawType", "m", "mInterval", GoogleApiAvailabilityLight.b, "mItemWidth", "o", "mItemHeight", b.r, "mShowPassType", DTransferConstants.SEARCH_KEY, "mTxtSize", "r", "mBoxLineSize", SOAP.XMLNS, "isPasswordHide", "getPassString", "()Ljava/lang/String;", "passString", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "PwdChangeListener", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class PassWordLayout extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int maxLength;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int inputIndex;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private List<String> mPassList;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private Map<String, String> keyValueMap;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private PwdChangeListener pwdChangeListener;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private Context mContext;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private boolean mIsShowInputLine;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private int mInputColor;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private int mNoinputColor;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private int mLineColor;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private int mTxtInputColor;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private int mDrawType;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private int mInterval;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private int mItemWidth;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private int mItemHeight;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private int mShowPassType;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private int mTxtSize;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private int mBoxLineSize;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private boolean isPasswordHide;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0004H&J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/device/view/PassWordLayout$PwdChangeListener;", "", "", "pwd", "", "onChange", "onNull", "onFinished", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public interface PwdChangeListener {
        void onChange(@NotNull String pwd);

        void onFinished(@NotNull String pwd);

        void onNull();
    }

    @JvmOverloads
    public PassWordLayout(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public PassWordLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ PassWordLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final void b(Context context) {
        int i = this.maxLength;
        if (i > 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                PassWordView passWordView = new PassWordView(context, null, 0, 6, null);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.mItemWidth, this.mItemHeight);
                if (i2 > 0) {
                    layoutParams.leftMargin = this.mInterval;
                }
                passWordView.setInputStateBoxColor(this.mInputColor);
                passWordView.setNoInputStateBoxColor(this.mNoinputColor);
                passWordView.setInputStateTextColor(this.mTxtInputColor);
                passWordView.setRemindLineColor(this.mLineColor);
                passWordView.setBoxDrawType(this.mDrawType);
                passWordView.setShowPassType(this.mShowPassType);
                passWordView.setDrawTxtSize(this.mTxtSize);
                passWordView.setBoxLineSize(this.mBoxLineSize);
                passWordView.setShowRemindLine(this.mIsShowInputLine);
                addView(passWordView, layoutParams);
                if (i3 >= i) {
                    break;
                } else {
                    i2 = i3;
                }
            }
        }
        startInput();
    }

    private final void c(Context context, AttributeSet attrs) {
        this.mContext = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.PassWordLayout);
        int i = R.styleable.PassWordLayout_box_input_color;
        int i2 = R.color.s14;
        this.mInputColor = typedArrayObtainStyledAttributes.getResourceId(i, i2);
        this.mNoinputColor = typedArrayObtainStyledAttributes.getResourceId(R.styleable.PassWordLayout_box_no_input_color, R.color.s4);
        this.mLineColor = typedArrayObtainStyledAttributes.getResourceId(R.styleable.PassWordLayout_input_line_color, i2);
        this.mTxtInputColor = typedArrayObtainStyledAttributes.getResourceId(R.styleable.PassWordLayout_text_input_color, i2);
        this.mDrawType = typedArrayObtainStyledAttributes.getInt(R.styleable.PassWordLayout_box_draw_type, 0);
        this.mInterval = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.PassWordLayout_interval_width, 4);
        this.maxLength = typedArrayObtainStyledAttributes.getInt(R.styleable.PassWordLayout_pass_leng, 6);
        this.mItemWidth = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.PassWordLayout_item_width, 40);
        this.mItemHeight = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.PassWordLayout_item_height, 40);
        this.mShowPassType = typedArrayObtainStyledAttributes.getInt(R.styleable.PassWordLayout_pass_inputed_type, 0);
        this.mTxtSize = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.PassWordLayout_draw_txt_size, 18);
        this.mBoxLineSize = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.PassWordLayout_draw_box_line_size, 4);
        this.mIsShowInputLine = typedArrayObtainStyledAttributes.getBoolean(R.styleable.PassWordLayout_is_show_input_line, true);
        typedArrayObtainStyledAttributes.recycle();
        this.mPassList = new ArrayList();
        setOrientation(0);
        setGravity(17);
        setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: yr5
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                PassWordLayout.d(this.a, view, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(PassWordLayout passWordLayout, View view, boolean z) {
        if (z) {
            View childAt = passWordLayout.getChildAt(passWordLayout.inputIndex);
            Objects.requireNonNull(childAt, "null cannot be cast to non-null type com.xiaomi.hm.health.device.view.PassWordView");
            PassWordView passWordView = (PassWordView) childAt;
            passWordView.setShowRemindLine(passWordLayout.mIsShowInputLine);
            passWordView.startInputState();
            return;
        }
        View childAt2 = passWordLayout.getChildAt(passWordLayout.inputIndex);
        Objects.requireNonNull(childAt2, "null cannot be cast to non-null type com.xiaomi.hm.health.device.view.PassWordView");
        PassWordView passWordView2 = (PassWordView) childAt2;
        passWordView2.setShowRemindLine(false);
        passWordView2.updateInputState(false);
    }

    public static /* synthetic */ void e(PassWordLayout passWordLayout, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        passWordLayout.setNextInput(i);
    }

    private final void setNextInput(int index) {
        if (index >= this.maxLength) {
            return;
        }
        View childAt = getChildAt(index);
        Objects.requireNonNull(childAt, "null cannot be cast to non-null type com.xiaomi.hm.health.device.view.PassWordView");
        ((PassWordView) childAt).startInputState();
    }

    private final void setPreviosInput(int index) {
        int i;
        if (index < 0 || index > (i = this.maxLength) || i <= 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            if (i2 >= index) {
                if (i2 == index) {
                    startInput(i2);
                }
                if (i2 > index) {
                    setNoInput(i2, false, "");
                }
            }
            if (i3 >= i) {
                return;
            } else {
                i2 = i3;
            }
        }
    }

    public void _$_clearFindViewByIdCache() {
    }

    public final void addPwd(@NotNull String pwd) {
        if (this.mPassList.size() < this.maxLength) {
            this.mPassList.add(pwd);
            setNoInput(this.mPassList.size() - 1, true, pwd);
            setNextInput(this.mPassList.size());
        }
        if (this.mPassList.size() < this.maxLength) {
            PwdChangeListener pwdChangeListener = this.pwdChangeListener;
            if (pwdChangeListener == null) {
                return;
            }
            pwdChangeListener.onChange(getPassString());
            return;
        }
        PwdChangeListener pwdChangeListener2 = this.pwdChangeListener;
        if (pwdChangeListener2 == null) {
            return;
        }
        pwdChangeListener2.onFinished(getPassString());
    }

    @NotNull
    public final String getPassString() {
        StringBuffer stringBuffer = new StringBuffer();
        Iterator<String> it2 = this.mPassList.iterator();
        while (it2.hasNext()) {
            stringBuffer.append(this.keyValueMap.get(it2.next()));
        }
        return stringBuffer.toString();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (getChildCount() == 0) {
            int i = this.maxLength;
            if ((this.mItemWidth * i) + ((i - 1) * this.mInterval) > getMeasuredWidth()) {
                int measuredWidth = getMeasuredWidth();
                int i2 = this.maxLength;
                int i3 = (measuredWidth - ((i2 - 1) * this.mInterval)) / i2;
                this.mItemWidth = i3;
                this.mItemHeight = i3;
            }
            b(getContext());
        }
    }

    public final void removeAllPwd() {
        if (this.mPassList.isEmpty()) {
            return;
        }
        int size = this.mPassList.size();
        if (size > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (i > 0) {
                    setNoInput(i, false, "");
                } else if (i == 0) {
                    View childAt = getChildAt(i);
                    Objects.requireNonNull(childAt, "null cannot be cast to non-null type com.xiaomi.hm.health.device.view.PassWordView");
                    PassWordView passWordView = (PassWordView) childAt;
                    passWordView.setPassText("");
                    passWordView.startInputState();
                }
                if (i2 >= size) {
                    break;
                } else {
                    i = i2;
                }
            }
        }
        this.mPassList.clear();
        this.inputIndex = 0;
        PwdChangeListener pwdChangeListener = this.pwdChangeListener;
        if (pwdChangeListener == null) {
            return;
        }
        pwdChangeListener.onNull();
    }

    public final void removePwd() {
        if (!this.mPassList.isEmpty()) {
            List<String> list = this.mPassList;
            list.remove(list.size() - 1);
            setPreviosInput(this.mPassList.size());
        }
        if (this.mPassList.size() > 0) {
            PwdChangeListener pwdChangeListener = this.pwdChangeListener;
            if (pwdChangeListener == null) {
                return;
            }
            pwdChangeListener.onChange(getPassString());
            return;
        }
        PwdChangeListener pwdChangeListener2 = this.pwdChangeListener;
        if (pwdChangeListener2 == null) {
            return;
        }
        pwdChangeListener2.onNull();
    }

    public final void setMaxLength(int maxLength) {
        this.maxLength = maxLength;
        invalidate();
    }

    public final void setNoInput(int index, boolean isInput, @NotNull String txt) {
        if (index < 0) {
            return;
        }
        View childAt = getChildAt(index);
        Objects.requireNonNull(childAt, "null cannot be cast to non-null type com.xiaomi.hm.health.device.view.PassWordView");
        PassWordView passWordView = (PassWordView) childAt;
        passWordView.setPassText(txt);
        passWordView.updateInputState(isInput);
    }

    public final void setPasswordKeyValue(@NotNull Map<String, String> keyValue) {
        this.keyValueMap = keyValue;
    }

    public final void setPwdChangeListener(@NotNull PwdChangeListener pwdChangeListener) {
        this.pwdChangeListener = pwdChangeListener;
    }

    public final void setTextSize(float size) {
        this.mTxtSize = (int) ViewUtils.sp2px(getContext(), size);
        invalidate();
    }

    public final void startInput() {
        View childAt = getChildAt(this.inputIndex);
        Objects.requireNonNull(childAt, "null cannot be cast to non-null type com.xiaomi.hm.health.device.view.PassWordView");
        ((PassWordView) childAt).startInputState();
    }

    public final boolean toggleClearText() {
        boolean z = !this.isPasswordHide;
        this.isPasswordHide = z;
        int i = z ? this.mShowPassType : 2;
        int i2 = 0;
        int i3 = this.maxLength;
        if (i3 > 0) {
            while (true) {
                int i4 = i2 + 1;
                View childAt = getChildAt(i2);
                Objects.requireNonNull(childAt, "null cannot be cast to non-null type com.xiaomi.hm.health.device.view.PassWordView");
                PassWordView passWordView = (PassWordView) childAt;
                passWordView.setShowPassType(i);
                passWordView.invalidate();
                if (i4 >= i3) {
                    break;
                }
                i2 = i4;
            }
        }
        return !this.isPasswordHide;
    }

    @JvmOverloads
    public PassWordLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.maxLength = 6;
        this.mPassList = new ArrayList();
        this.keyValueMap = r.emptyMap();
        c(context, attributeSet);
    }

    public final void startInput(int index) {
        if (index < 0 || index > this.maxLength) {
            return;
        }
        View childAt = getChildAt(index);
        Objects.requireNonNull(childAt, "null cannot be cast to non-null type com.xiaomi.hm.health.device.view.PassWordView");
        PassWordView passWordView = (PassWordView) childAt;
        passWordView.setPassText("");
        passWordView.startInputState();
    }
}
