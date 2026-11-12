package com.huami.account;

import com.huami.account.bean.LegalInfoType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001BÄ\u0001\u0012K\u0010\u0010\u001aG\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u000b\u0012K\u0010\u0012\u001aG\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u000b\u0012!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00070\u0013¢\u0006\u0004\b\u0017\u0010\u0018J\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004J\u001e\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002R[\u0010\u0010\u001aG\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR[\u0010\u0012\u001aG\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR1\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00070\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/huami/account/AgreementFallbackNavigator;", "", "Lcom/huami/account/bean/LegalInfoType;", "type", "", "url", "title", "", "goInnerUrl", "goUrl", "goLocalLanguageList", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "a", "Lkotlin/jvm/functions/Function3;", "urlAction", "b", "innerUrlAction", "Lkotlin/Function1;", "c", "Lkotlin/jvm/functions/Function1;", "localAction", "<init>", "(Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;)V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class AgreementFallbackNavigator {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Function3<LegalInfoType, String, String, Unit> urlAction;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Function3<LegalInfoType, String, String, Unit> innerUrlAction;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Function1<LegalInfoType, Unit> localAction;

    /* JADX WARN: Multi-variable type inference failed */
    public AgreementFallbackNavigator(@NotNull Function3<? super LegalInfoType, ? super String, ? super String, Unit> function3, @NotNull Function3<? super LegalInfoType, ? super String, ? super String, Unit> function4, @NotNull Function1<? super LegalInfoType, Unit> function1) {
        this.urlAction = function3;
        this.innerUrlAction = function4;
        this.localAction = function1;
    }

    public final void goInnerUrl(@NotNull LegalInfoType type, @NotNull String url, @NotNull String title) {
        this.innerUrlAction.invoke(type, url, title);
    }

    public final void goLocalLanguageList(@NotNull LegalInfoType type) {
        this.localAction.invoke(type);
    }

    public final void goUrl(@NotNull LegalInfoType type, @NotNull String url, @NotNull String title) {
        this.urlAction.invoke(type, url, title);
    }
}
