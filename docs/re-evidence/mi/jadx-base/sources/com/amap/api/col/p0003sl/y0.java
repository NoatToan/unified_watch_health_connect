package com.amap.api.col.p0003sl;

import defpackage.o0t;

/* JADX INFO: loaded from: classes4.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iu.c f6352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6353b;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6354a;

        static {
            int[] iArr = new int[iu.c.values().length];
            f6354a = iArr;
            try {
                iArr[iu.c.ShowUnknowCode.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6354a[iu.c.ShowNoShowCode.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6354a[iu.c.InfoUnknowCode.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6354a[iu.c.InfoNotContainCode.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6354a[iu.c.AgreeUnknowCode.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6354a[iu.c.AgreeNotAgreeCode.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6354a[iu.c.InvaildUserKeyCode.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f6354a[iu.c.IllegalArgument.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f6354a[iu.c.SuccessCode.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public y0(iu.c cVar, o0t o0tVar) {
        String str;
        this.f6352a = cVar;
        switch (a.f6354a[cVar.ordinal()]) {
            case 1:
                str = String.format("***确保调用SDK任何接口前先调用更新隐私合规updatePrivacyShow、updatePrivacyAgree两个接口并且参数值都为true，若未正确设置有崩溃风险***\n使用%s SDK 功能前请设置隐私权政策是否弹窗告知用户", o0tVar.a());
                break;
            case 2:
                str = String.format("***确保调用SDK任何接口前先调用更新隐私合规updatePrivacyShow、updatePrivacyAgree两个接口并且参数值都为true，若未正确设置有崩溃风险***\n使用%s SDK 功能前请确保隐私权政策已弹窗告知用户", o0tVar.a());
                break;
            case 3:
                str = String.format("***确保调用SDK任何接口前先调用更新隐私合规updatePrivacyShow、updatePrivacyAgree两个接口并且参数值都为true，若未正确设置有崩溃风险***\n使用%s SDK 功能前请确保设置隐私权政策是否包含高德开平隐私权政策", o0tVar.a());
                break;
            case 4:
                str = String.format("***确保调用SDK任何接口前先调用更新隐私合规updatePrivacyShow、updatePrivacyAgree两个接口并且参数值都为true，若未正确设置有崩溃风险***\n使用%s SDK 功能前请确保隐私权政策已经包含高德开平隐私权政策", o0tVar.a());
                break;
            case 5:
                str = String.format("***确保调用SDK任何接口前先调用更新隐私合规updatePrivacyShow、updatePrivacyAgree两个接口并且参数值都为true，若未正确设置有崩溃风险***\n使用%s SDK 功能前请确保设置隐私权政策是否取得用户同意", o0tVar.a());
                break;
            case 6:
                str = String.format("***确保调用SDK任何接口前先调用更新隐私合规updatePrivacyShow、updatePrivacyAgree两个接口并且参数值都为true，若未正确设置有崩溃风险***\n使用%s SDK 功能前请确保隐私权政策已取得用户同意", o0tVar.a());
                break;
            case 7:
                str = String.format("***确保调用SDK任何接口前先调用更新隐私合规updatePrivacyShow、updatePrivacyAgree两个接口并且参数值都为true，若未正确设置有崩溃风险***\n使用%s SDK 功能使用前请确保已经正确设置apiKey，如有疑问请在高德开放平台官网中搜索【INVALID_USER_KEY】相关内容进行解决。", o0tVar.a());
                break;
            case 8:
                str = String.format("***确保调用SDK任何接口前先调用更新隐私合规updatePrivacyShow、updatePrivacyAgree两个接口并且参数值都为true，若未正确设置有崩溃风险***\n参数非法，context 或 sdkInfo为空", new Object[0]);
                break;
            case 9:
                str = String.format("设置隐私政策成功", new Object[0]);
                break;
            default:
                str = "";
                break;
        }
        this.f6353b = str;
    }
}
