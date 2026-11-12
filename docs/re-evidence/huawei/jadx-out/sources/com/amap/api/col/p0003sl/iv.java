package com.amap.api.col.p0003sl;

/* JADX INFO: loaded from: classes4.dex */
public final class iv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iu.c f2835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2836b;

    iv(iu.c cVar, ix ixVar) {
        String str;
        this.f2835a = cVar;
        switch (AnonymousClass1.f2837a[cVar.ordinal()]) {
            case 1:
                str = String.format("***确保调用SDK任何接口前先调用更新隐私合规updatePrivacyShow、updatePrivacyAgree两个接口并且参数值都为true，若未正确设置有崩溃风险***\n使用%s SDK 功能前请设置隐私权政策是否弹窗告知用户", ixVar.a());
                break;
            case 2:
                str = String.format("***确保调用SDK任何接口前先调用更新隐私合规updatePrivacyShow、updatePrivacyAgree两个接口并且参数值都为true，若未正确设置有崩溃风险***\n使用%s SDK 功能前请确保隐私权政策已弹窗告知用户", ixVar.a());
                break;
            case 3:
                str = String.format("***确保调用SDK任何接口前先调用更新隐私合规updatePrivacyShow、updatePrivacyAgree两个接口并且参数值都为true，若未正确设置有崩溃风险***\n使用%s SDK 功能前请确保设置隐私权政策是否包含高德开平隐私权政策", ixVar.a());
                break;
            case 4:
                str = String.format("***确保调用SDK任何接口前先调用更新隐私合规updatePrivacyShow、updatePrivacyAgree两个接口并且参数值都为true，若未正确设置有崩溃风险***\n使用%s SDK 功能前请确保隐私权政策已经包含高德开平隐私权政策", ixVar.a());
                break;
            case 5:
                str = String.format("***确保调用SDK任何接口前先调用更新隐私合规updatePrivacyShow、updatePrivacyAgree两个接口并且参数值都为true，若未正确设置有崩溃风险***\n使用%s SDK 功能前请确保设置隐私权政策是否取得用户同意", ixVar.a());
                break;
            case 6:
                str = String.format("***确保调用SDK任何接口前先调用更新隐私合规updatePrivacyShow、updatePrivacyAgree两个接口并且参数值都为true，若未正确设置有崩溃风险***\n使用%s SDK 功能前请确保隐私权政策已取得用户同意", ixVar.a());
                break;
            case 7:
                str = String.format("***确保调用SDK任何接口前先调用更新隐私合规updatePrivacyShow、updatePrivacyAgree两个接口并且参数值都为true，若未正确设置有崩溃风险***\n使用%s SDK 功能使用前请确保已经正确设置apiKey，如有疑问请在高德开放平台官网中搜索【INVALID_USER_KEY】相关内容进行解决。", ixVar.a());
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
        this.f2836b = str;
    }

    /* JADX INFO: renamed from: com.amap.api.col.3sl.iv$1, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2837a;

        static {
            int[] iArr = new int[iu.c.values().length];
            f2837a = iArr;
            try {
                iArr[iu.c.ShowUnknowCode.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2837a[iu.c.ShowNoShowCode.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2837a[iu.c.InfoUnknowCode.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2837a[iu.c.InfoNotContainCode.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2837a[iu.c.AgreeUnknowCode.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2837a[iu.c.AgreeNotAgreeCode.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2837a[iu.c.InvaildUserKeyCode.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2837a[iu.c.IllegalArgument.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2837a[iu.c.SuccessCode.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }
}
