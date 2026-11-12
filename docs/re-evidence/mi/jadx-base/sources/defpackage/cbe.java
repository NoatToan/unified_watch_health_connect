package defpackage;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableType;
import com.facebook.yoga.YogaAlign;
import com.facebook.yoga.YogaDisplay;
import com.facebook.yoga.YogaFlexDirection;
import com.facebook.yoga.YogaJustify;
import com.facebook.yoga.YogaOverflow;
import com.facebook.yoga.YogaPositionType;
import com.facebook.yoga.YogaUnit;
import com.facebook.yoga.YogaWrap;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fitness.statistics.StatConstants;
import kotlin.jvm.internal.FloatCompanionObject;

/* JADX INFO: loaded from: classes4.dex */
public class cbe extends pej {
    boolean mCollapsable;
    private final b mTempYogaValue = new b(null);

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5159a;

        static {
            int[] iArr = new int[YogaUnit.values().length];
            f5159a = iArr;
            try {
                iArr[YogaUnit.POINT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5159a[YogaUnit.UNDEFINED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5159a[YogaUnit.AUTO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5159a[YogaUnit.PERCENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f5160a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public YogaUnit f5161b;

        public b() {
        }

        public /* synthetic */ b(a aVar) {
            this();
        }

        public void a(Dynamic dynamic) {
            if (dynamic.isNull()) {
                this.f5161b = YogaUnit.UNDEFINED;
                this.f5160a = Float.NaN;
                return;
            }
            if (dynamic.getType() != ReadableType.String) {
                this.f5161b = YogaUnit.POINT;
                this.f5160a = exh.b(dynamic.asDouble());
                return;
            }
            String strAsString = dynamic.asString();
            if (strAsString.equals("auto")) {
                this.f5161b = YogaUnit.AUTO;
                this.f5160a = Float.NaN;
            } else if (strAsString.endsWith("%")) {
                this.f5161b = YogaUnit.PERCENT;
                this.f5160a = Float.parseFloat(strAsString.substring(0, strAsString.length() - 1));
            } else {
                throw new IllegalArgumentException("Unknown value: " + strAsString);
            }
        }
    }

    private int maybeTransformLeftRightToStartEnd(int i) {
        if (!poc.d().b(getThemedContext())) {
            return i;
        }
        if (i == 0) {
            return 4;
        }
        if (i != 2) {
            return i;
        }
        return 5;
    }

    @iej(name = "alignContent")
    public void setAlignContent(String str) {
        if (isVirtual()) {
            return;
        }
        if (str == null) {
            setAlignContent(YogaAlign.FLEX_START);
            return;
        }
        switch (str) {
            case "stretch":
                setAlignContent(YogaAlign.STRETCH);
                return;
            case "baseline":
                setAlignContent(YogaAlign.BASELINE);
                return;
            case "center":
                setAlignContent(YogaAlign.CENTER);
                return;
            case "flex-start":
                setAlignContent(YogaAlign.FLEX_START);
                return;
            case "auto":
                setAlignContent(YogaAlign.AUTO);
                return;
            case "space-between":
                setAlignContent(YogaAlign.SPACE_BETWEEN);
                return;
            case "flex-end":
                setAlignContent(YogaAlign.FLEX_END);
                return;
            case "space-around":
                setAlignContent(YogaAlign.SPACE_AROUND);
                return;
            default:
                throw new JSApplicationIllegalArgumentException("invalid value for alignContent: " + str);
        }
    }

    @iej(name = "alignItems")
    public void setAlignItems(String str) {
        if (isVirtual()) {
            return;
        }
        if (str == null) {
            setAlignItems(YogaAlign.STRETCH);
            return;
        }
        switch (str) {
            case "stretch":
                setAlignItems(YogaAlign.STRETCH);
                return;
            case "baseline":
                setAlignItems(YogaAlign.BASELINE);
                return;
            case "center":
                setAlignItems(YogaAlign.CENTER);
                return;
            case "flex-start":
                setAlignItems(YogaAlign.FLEX_START);
                return;
            case "auto":
                setAlignItems(YogaAlign.AUTO);
                return;
            case "space-between":
                setAlignItems(YogaAlign.SPACE_BETWEEN);
                return;
            case "flex-end":
                setAlignItems(YogaAlign.FLEX_END);
                return;
            case "space-around":
                setAlignItems(YogaAlign.SPACE_AROUND);
                return;
            default:
                throw new JSApplicationIllegalArgumentException("invalid value for alignItems: " + str);
        }
    }

    @iej(name = "alignSelf")
    public void setAlignSelf(String str) {
        if (isVirtual()) {
            return;
        }
        if (str == null) {
            setAlignSelf(YogaAlign.AUTO);
            return;
        }
        switch (str) {
            case "stretch":
                setAlignSelf(YogaAlign.STRETCH);
                return;
            case "baseline":
                setAlignSelf(YogaAlign.BASELINE);
                return;
            case "center":
                setAlignSelf(YogaAlign.CENTER);
                return;
            case "flex-start":
                setAlignSelf(YogaAlign.FLEX_START);
                return;
            case "auto":
                setAlignSelf(YogaAlign.AUTO);
                return;
            case "space-between":
                setAlignSelf(YogaAlign.SPACE_BETWEEN);
                return;
            case "flex-end":
                setAlignSelf(YogaAlign.FLEX_END);
                return;
            case "space-around":
                setAlignSelf(YogaAlign.SPACE_AROUND);
                return;
            default:
                throw new JSApplicationIllegalArgumentException("invalid value for alignSelf: " + str);
        }
    }

    @iej(defaultFloat = FloatCompanionObject.NaN, name = "aspectRatio")
    public void setAspectRatio(float f) {
        setStyleAspectRatio(f);
    }

    @jej(defaultFloat = FloatCompanionObject.NaN, names = {"borderWidth", "borderStartWidth", "borderEndWidth", "borderTopWidth", "borderBottomWidth", "borderLeftWidth", "borderRightWidth"})
    public void setBorderWidths(int i, float f) {
        if (isVirtual()) {
            return;
        }
        setBorder(maybeTransformLeftRightToStartEnd(qwq.f31917a[i]), exh.c(f));
    }

    @iej(name = "collapsable")
    public void setCollapsable(boolean z) {
        this.mCollapsable = z;
    }

    @iej(name = "display")
    public void setDisplay(String str) {
        if (isVirtual()) {
            return;
        }
        if (str == null) {
            setDisplay(YogaDisplay.FLEX);
            return;
        }
        if (str.equals("flex")) {
            setDisplay(YogaDisplay.FLEX);
        } else {
            if (str.equals("none")) {
                setDisplay(YogaDisplay.NONE);
                return;
            }
            throw new JSApplicationIllegalArgumentException("invalid value for display: " + str);
        }
    }

    @Override // defpackage.pej
    @iej(defaultFloat = 0.0f, name = "flex")
    public void setFlex(float f) {
        if (isVirtual()) {
            return;
        }
        super.setFlex(f);
    }

    @iej(name = "flexBasis")
    public void setFlexBasis(Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        this.mTempYogaValue.a(dynamic);
        int i = a.f5159a[this.mTempYogaValue.f5161b.ordinal()];
        if (i == 1 || i == 2) {
            setFlexBasis(this.mTempYogaValue.f5160a);
        } else if (i == 3) {
            setFlexBasisAuto();
        } else if (i == 4) {
            setFlexBasisPercent(this.mTempYogaValue.f5160a);
        }
        dynamic.recycle();
    }

    @iej(name = "flexDirection")
    public void setFlexDirection(String str) {
        if (isVirtual()) {
            return;
        }
        if (str == null) {
            setFlexDirection(YogaFlexDirection.COLUMN);
            return;
        }
        switch (str) {
            case "row-reverse":
                setFlexDirection(YogaFlexDirection.ROW_REVERSE);
                return;
            case "column":
                setFlexDirection(YogaFlexDirection.COLUMN);
                return;
            case "row":
                setFlexDirection(YogaFlexDirection.ROW);
                return;
            case "column-reverse":
                setFlexDirection(YogaFlexDirection.COLUMN_REVERSE);
                return;
            default:
                throw new JSApplicationIllegalArgumentException("invalid value for flexDirection: " + str);
        }
    }

    @Override // defpackage.pej
    @iej(defaultFloat = 0.0f, name = "flexGrow")
    public void setFlexGrow(float f) {
        if (isVirtual()) {
            return;
        }
        super.setFlexGrow(f);
    }

    @Override // defpackage.pej
    @iej(defaultFloat = 0.0f, name = "flexShrink")
    public void setFlexShrink(float f) {
        if (isVirtual()) {
            return;
        }
        super.setFlexShrink(f);
    }

    @iej(name = "flexWrap")
    public void setFlexWrap(String str) {
        if (isVirtual()) {
            return;
        }
        if (str == null) {
            setFlexWrap(YogaWrap.NO_WRAP);
            return;
        }
        switch (str) {
            case "nowrap":
                setFlexWrap(YogaWrap.NO_WRAP);
                return;
            case "wrap-reverse":
                setFlexWrap(YogaWrap.WRAP_REVERSE);
                return;
            case "wrap":
                setFlexWrap(YogaWrap.WRAP);
                return;
            default:
                throw new JSApplicationIllegalArgumentException("invalid value for flexWrap: " + str);
        }
    }

    @iej(name = "height")
    public void setHeight(Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        this.mTempYogaValue.a(dynamic);
        int i = a.f5159a[this.mTempYogaValue.f5161b.ordinal()];
        if (i == 1 || i == 2) {
            setStyleHeight(this.mTempYogaValue.f5160a);
        } else if (i == 3) {
            setStyleHeightAuto();
        } else if (i == 4) {
            setStyleHeightPercent(this.mTempYogaValue.f5160a);
        }
        dynamic.recycle();
    }

    @iej(name = "justifyContent")
    public void setJustifyContent(String str) {
        if (isVirtual()) {
            return;
        }
        if (str == null) {
            setJustifyContent(YogaJustify.FLEX_START);
            return;
        }
        switch (str) {
            case "center":
                setJustifyContent(YogaJustify.CENTER);
                return;
            case "flex-start":
                setJustifyContent(YogaJustify.FLEX_START);
                return;
            case "space-between":
                setJustifyContent(YogaJustify.SPACE_BETWEEN);
                return;
            case "flex-end":
                setJustifyContent(YogaJustify.FLEX_END);
                return;
            case "space-around":
                setJustifyContent(YogaJustify.SPACE_AROUND);
                return;
            case "space-evenly":
                setJustifyContent(YogaJustify.SPACE_EVENLY);
                return;
            default:
                throw new JSApplicationIllegalArgumentException("invalid value for justifyContent: " + str);
        }
    }

    @jej(names = {"margin", "marginVertical", "marginHorizontal", "marginStart", "marginEnd", "marginTop", "marginBottom", "marginLeft", "marginRight"})
    public void setMargins(int i, Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        int iMaybeTransformLeftRightToStartEnd = maybeTransformLeftRightToStartEnd(qwq.f31918b[i]);
        this.mTempYogaValue.a(dynamic);
        int i2 = a.f5159a[this.mTempYogaValue.f5161b.ordinal()];
        if (i2 == 1 || i2 == 2) {
            setMargin(iMaybeTransformLeftRightToStartEnd, this.mTempYogaValue.f5160a);
        } else if (i2 == 3) {
            setMarginAuto(iMaybeTransformLeftRightToStartEnd);
        } else if (i2 == 4) {
            setMarginPercent(iMaybeTransformLeftRightToStartEnd, this.mTempYogaValue.f5160a);
        }
        dynamic.recycle();
    }

    @iej(name = "maxHeight")
    public void setMaxHeight(Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        this.mTempYogaValue.a(dynamic);
        int i = a.f5159a[this.mTempYogaValue.f5161b.ordinal()];
        if (i == 1 || i == 2) {
            setStyleMaxHeight(this.mTempYogaValue.f5160a);
        } else if (i == 4) {
            setStyleMaxHeightPercent(this.mTempYogaValue.f5160a);
        }
        dynamic.recycle();
    }

    @iej(name = "maxWidth")
    public void setMaxWidth(Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        this.mTempYogaValue.a(dynamic);
        int i = a.f5159a[this.mTempYogaValue.f5161b.ordinal()];
        if (i == 1 || i == 2) {
            setStyleMaxWidth(this.mTempYogaValue.f5160a);
        } else if (i == 4) {
            setStyleMaxWidthPercent(this.mTempYogaValue.f5160a);
        }
        dynamic.recycle();
    }

    @iej(name = "minHeight")
    public void setMinHeight(Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        this.mTempYogaValue.a(dynamic);
        int i = a.f5159a[this.mTempYogaValue.f5161b.ordinal()];
        if (i == 1 || i == 2) {
            setStyleMinHeight(this.mTempYogaValue.f5160a);
        } else if (i == 4) {
            setStyleMinHeightPercent(this.mTempYogaValue.f5160a);
        }
        dynamic.recycle();
    }

    @iej(name = "minWidth")
    public void setMinWidth(Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        this.mTempYogaValue.a(dynamic);
        int i = a.f5159a[this.mTempYogaValue.f5161b.ordinal()];
        if (i == 1 || i == 2) {
            setStyleMinWidth(this.mTempYogaValue.f5160a);
        } else if (i == 4) {
            setStyleMinWidthPercent(this.mTempYogaValue.f5160a);
        }
        dynamic.recycle();
    }

    @iej(name = "overflow")
    public void setOverflow(String str) {
        if (isVirtual()) {
            return;
        }
        if (str == null) {
            setOverflow(YogaOverflow.VISIBLE);
            return;
        }
        switch (str) {
            case "hidden":
                setOverflow(YogaOverflow.HIDDEN);
                return;
            case "scroll":
                setOverflow(YogaOverflow.SCROLL);
                return;
            case "visible":
                setOverflow(YogaOverflow.VISIBLE);
                return;
            default:
                throw new JSApplicationIllegalArgumentException("invalid value for overflow: " + str);
        }
    }

    @jej(names = {"padding", "paddingVertical", "paddingHorizontal", "paddingStart", "paddingEnd", "paddingTop", "paddingBottom", "paddingLeft", "paddingRight"})
    public void setPaddings(int i, Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        int iMaybeTransformLeftRightToStartEnd = maybeTransformLeftRightToStartEnd(qwq.f31918b[i]);
        this.mTempYogaValue.a(dynamic);
        int i2 = a.f5159a[this.mTempYogaValue.f5161b.ordinal()];
        if (i2 == 1 || i2 == 2) {
            setPadding(iMaybeTransformLeftRightToStartEnd, this.mTempYogaValue.f5160a);
        } else if (i2 == 4) {
            setPaddingPercent(iMaybeTransformLeftRightToStartEnd, this.mTempYogaValue.f5160a);
        }
        dynamic.recycle();
    }

    @iej(name = "position")
    public void setPosition(String str) {
        if (isVirtual()) {
            return;
        }
        if (str == null) {
            setPositionType(YogaPositionType.RELATIVE);
            return;
        }
        if (str.equals("relative")) {
            setPositionType(YogaPositionType.RELATIVE);
        } else {
            if (str.equals("absolute")) {
                setPositionType(YogaPositionType.ABSOLUTE);
                return;
            }
            throw new JSApplicationIllegalArgumentException("invalid value for position: " + str);
        }
    }

    @jej(names = {StatConstants.PARAM_START, StatConstants.PARAM_END, "left", TSMAuthContants.PARAM_KEY_RIGHT, "top", "bottom"})
    public void setPositionValues(int i, Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        int iMaybeTransformLeftRightToStartEnd = maybeTransformLeftRightToStartEnd(new int[]{4, 5, 0, 2, 1, 3}[i]);
        this.mTempYogaValue.a(dynamic);
        int i2 = a.f5159a[this.mTempYogaValue.f5161b.ordinal()];
        if (i2 == 1 || i2 == 2) {
            setPosition(iMaybeTransformLeftRightToStartEnd, this.mTempYogaValue.f5160a);
        } else if (i2 == 4) {
            setPositionPercent(iMaybeTransformLeftRightToStartEnd, this.mTempYogaValue.f5160a);
        }
        dynamic.recycle();
    }

    @Override // defpackage.pej
    @iej(name = "onLayout")
    public void setShouldNotifyOnLayout(boolean z) {
        super.setShouldNotifyOnLayout(z);
    }

    @iej(name = "width")
    public void setWidth(Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        this.mTempYogaValue.a(dynamic);
        int i = a.f5159a[this.mTempYogaValue.f5161b.ordinal()];
        if (i == 1 || i == 2) {
            setStyleWidth(this.mTempYogaValue.f5160a);
        } else if (i == 3) {
            setStyleWidthAuto();
        } else if (i == 4) {
            setStyleWidthPercent(this.mTempYogaValue.f5160a);
        }
        dynamic.recycle();
    }
}
