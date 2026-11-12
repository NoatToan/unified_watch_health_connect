package com.facebook.react.views.text;

import android.text.TextUtils;
import android.view.View;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.uimanager.BaseViewManager;
import defpackage.ex5;
import defpackage.exh;
import defpackage.iej;
import defpackage.j0s;
import defpackage.jej;
import defpackage.ncj;
import kotlin.jvm.internal.FloatCompanionObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ReactTextAnchorViewManager<T extends View, C extends ncj> extends BaseViewManager<T, C> {
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3};

    @jej(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor"})
    public void setBorderColor(ReactTextView reactTextView, int i, Integer num) {
        reactTextView.f(SPACING_TYPES[i], num == null ? Float.NaN : num.intValue() & 16777215, num != null ? num.intValue() >>> 24 : Float.NaN);
    }

    @jej(defaultFloat = FloatCompanionObject.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public void setBorderRadius(ReactTextView reactTextView, int i, float f) {
        if (!j0s.a(f)) {
            f = exh.c(f);
        }
        if (i == 0) {
            reactTextView.setBorderRadius(f);
        } else {
            reactTextView.g(f, i - 1);
        }
    }

    @iej(name = "borderStyle")
    public void setBorderStyle(ReactTextView reactTextView, String str) {
        reactTextView.setBorderStyle(str);
    }

    @jej(defaultFloat = FloatCompanionObject.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth"})
    public void setBorderWidth(ReactTextView reactTextView, int i, float f) {
        if (!j0s.a(f)) {
            f = exh.c(f);
        }
        reactTextView.h(SPACING_TYPES[i], f);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:20:0x003f  */
    @iej(name = "dataDetectorType")
    public void setDataDetectorType(ReactTextView reactTextView, String str) {
        byte b2;
        switch (str) {
            case "phoneNumber":
                b2 = 0;
                break;
            case "all":
                b2 = 3;
                break;
            case "link":
                b2 = 1;
                break;
            case "none":
                b2 = 4;
                break;
            case "email":
                b2 = 2;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            reactTextView.setLinkifyMask(4);
            return;
        }
        if (b2 == 1) {
            reactTextView.setLinkifyMask(1);
            return;
        }
        if (b2 == 2) {
            reactTextView.setLinkifyMask(2);
        } else if (b2 != 3) {
            reactTextView.setLinkifyMask(0);
        } else {
            reactTextView.setLinkifyMask(15);
        }
    }

    @iej(defaultBoolean = false, name = "disabled")
    public void setDisabled(ReactTextView reactTextView, boolean z) {
        reactTextView.setEnabled(!z);
    }

    @iej(name = "ellipsizeMode")
    public void setEllipsizeMode(ReactTextView reactTextView, String str) {
        if (str == null || str.equals("tail")) {
            reactTextView.setEllipsizeLocation(TextUtils.TruncateAt.END);
            return;
        }
        if (str.equals("head")) {
            reactTextView.setEllipsizeLocation(TextUtils.TruncateAt.START);
            return;
        }
        if (str.equals("middle")) {
            reactTextView.setEllipsizeLocation(TextUtils.TruncateAt.MIDDLE);
        } else {
            if (str.equals("clip")) {
                reactTextView.setEllipsizeLocation(null);
                return;
            }
            throw new JSApplicationIllegalArgumentException("Invalid ellipsizeMode: " + str);
        }
    }

    @iej(defaultBoolean = true, name = "includeFontPadding")
    public void setIncludeFontPadding(ReactTextView reactTextView, boolean z) {
        reactTextView.setIncludeFontPadding(z);
    }

    @iej(name = "onInlineViewLayout")
    public void setNotifyOnInlineViewLayout(ReactTextView reactTextView, boolean z) {
        reactTextView.setNotifyOnInlineViewLayout(z);
    }

    @iej(defaultInt = Integer.MAX_VALUE, name = "numberOfLines")
    public void setNumberOfLines(ReactTextView reactTextView, int i) {
        reactTextView.setNumberOfLines(i);
    }

    @iej(name = "selectable")
    public void setSelectable(ReactTextView reactTextView, boolean z) {
        reactTextView.setTextIsSelectable(z);
    }

    @iej(customType = "Color", name = "selectionColor")
    public void setSelectionColor(ReactTextView reactTextView, Integer num) {
        if (num == null) {
            reactTextView.setHighlightColor(ex5.c(reactTextView.getContext()));
        } else {
            reactTextView.setHighlightColor(num.intValue());
        }
    }

    @iej(name = "textAlignVertical")
    public void setTextAlignVertical(ReactTextView reactTextView, String str) {
        if (str == null || "auto".equals(str)) {
            reactTextView.setGravityVertical(0);
            return;
        }
        if ("top".equals(str)) {
            reactTextView.setGravityVertical(48);
            return;
        }
        if ("bottom".equals(str)) {
            reactTextView.setGravityVertical(80);
        } else {
            if ("center".equals(str)) {
                reactTextView.setGravityVertical(16);
                return;
            }
            throw new JSApplicationIllegalArgumentException("Invalid textAlignVertical: " + str);
        }
    }
}
