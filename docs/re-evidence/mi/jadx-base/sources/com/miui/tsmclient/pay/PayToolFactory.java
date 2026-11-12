package com.miui.tsmclient.pay;

import com.miui.tsmclient.util.ReflectUtil;

/* JADX INFO: loaded from: classes6.dex */
public class PayToolFactory {

    /* JADX INFO: renamed from: com.miui.tsmclient.pay.PayToolFactory$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$miui$tsmclient$pay$PayType;

        static {
            int[] iArr = new int[PayType.values().length];
            $SwitchMap$com$miui$tsmclient$pay$PayType = iArr;
            try {
                iArr[PayType.Mipay.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$miui$tsmclient$pay$PayType[PayType.UCashier.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$miui$tsmclient$pay$PayType[PayType.EntryPay.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$miui$tsmclient$pay$PayType[PayType.UPInAppPay.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$miui$tsmclient$pay$PayType[PayType.WxPay.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$miui$tsmclient$pay$PayType[PayType.AliPay.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static IPayTool getPayTool(String str) {
        return getPayTool(PayType.Mipay, str);
    }

    public static IPayTool getPayTool(PayType payType, String str) {
        switch (AnonymousClass1.$SwitchMap$com$miui$tsmclient$pay$PayType[payType.ordinal()]) {
            case 1:
            case 2:
                return (IPayTool) ReflectUtil.newInstance("com.miui.tsmclient.pay.MiPayTool", (Class<?>[]) null, new Object[0]);
            case 3:
                return (IPayTool) ReflectUtil.newInstance("com.miui.tsmclient.pay.EntryPayTool", (Class<?>[]) new Class[]{String.class}, str);
            case 4:
                return (IPayTool) ReflectUtil.newInstance("com.miui.tsmclient.pay.UPInAppPayTool", (Class<?>[]) null, new Object[0]);
            case 5:
                return (IPayTool) ReflectUtil.newInstance("com.miui.tsmclient.pay.WxPayTool", (Class<?>[]) null, new Object[0]);
            case 6:
                return (IPayTool) ReflectUtil.newInstance("com.miui.tsmclient.pay.AliPayTool", (Class<?>[]) null, new Object[0]);
            default:
                return null;
        }
    }
}
