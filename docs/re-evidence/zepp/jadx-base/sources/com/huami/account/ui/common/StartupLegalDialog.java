package com.huami.account.ui.common;

import androidx.appcompat.app.AppCompatActivity;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.bean.LegalInfoType;
import com.huami.account.keeper.AnonymousKeeper;
import com.huami.account.ui.legal.UserAgreementStartUpFragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated(message = "使用 StartupLegalUnifyDialog 替换")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001BI\b\u0007\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0010\u0012\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0004\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060\u001d\u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060\u001d¢\u0006\u0004\b&\u0010'J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\tH\u0002J\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u000f\u001a\u00020\u000eR\u0019\u0010\u0014\u001a\u00020\u00108\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u001c\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060\u001d8\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060\u001d8\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010!¨\u0006("}, d2 = {"Lcom/huami/account/ui/common/StartupLegalDialog;", "", "Landroidx/appcompat/app/AppCompatActivity;", "activity", "", "index", "", "a", "", "Lcom/huami/account/bean/LegalInfoType;", "b", "type", "c", "show", "", "isAgreeAllTypes", "", "Ljava/lang/String;", "getAreaCode", "()Ljava/lang/String;", "areaCode", "Ljava/util/List;", "getTypes", "()Ljava/util/List;", "types", LogUtil.I, "getDelaySecond", "()I", "delaySecond", "Lkotlin/Function0;", GoogleApiAvailabilityLight.a, "Lkotlin/jvm/functions/Function0;", "getOnCancel", "()Lkotlin/jvm/functions/Function0;", "onCancel", "e", "getOnAgreeAll", "onAgreeAll", "<init>", "(Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class StartupLegalDialog {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String areaCode;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final List<LegalInfoType> types;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int delaySecond;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Function0<Unit> onCancel;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Function0<Unit> onAgreeAll;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/account/bean/LegalInfoType;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<LegalInfoType, CharSequence> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(@NotNull LegalInfoType legalInfoType) {
            return legalInfoType.getTypeName();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public StartupLegalDialog(@NotNull String str, @NotNull List<? extends LegalInfoType> list, int i, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function1) {
        this.areaCode = str;
        this.types = list;
        this.delaySecond = i;
        this.onCancel = function0;
        this.onAgreeAll = function1;
    }

    @JvmOverloads
    public StartupLegalDialog(@NotNull String str, @NotNull List<? extends LegalInfoType> list, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function1) {
        this(str, list, 0, function0, function1, 4, null);
    }

    @JvmOverloads
    public StartupLegalDialog(@NotNull String str, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function1) {
        this(str, null, 0, function0, function1, 6, null);
    }

    @JvmOverloads
    public StartupLegalDialog(@NotNull Function0<Unit> function0, @NotNull Function0<Unit> function1) {
        this(null, null, 0, function0, function1, 7, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(final AppCompatActivity activity, final int index) {
        final LegalInfoType legalInfoType = this.types.get(index);
        final boolean z = index == CollectionsKt__CollectionsKt.getLastIndex(this.types);
        if (!b().contains(legalInfoType)) {
            UserAgreementStartUpFragment userAgreementStartUpFragmentNewInstance = UserAgreementStartUpFragment.INSTANCE.newInstance(legalInfoType, this.areaCode, this.delaySecond);
            userAgreementStartUpFragmentNewInstance.setListener(new UserAgreementStartUpFragment.OnDialogListener() { // from class: com.huami.account.ui.common.StartupLegalDialog$checkShowAgreement$1
                @Override // com.huami.account.ui.legal.BaseAgreementConfirmFragment.OnDialogListener
                public void onAgree() {
                    this.a.c(legalInfoType);
                    if (z) {
                        this.a.getOnAgreeAll().invoke();
                    } else {
                        this.a.a(activity, index + 1);
                    }
                }

                @Override // com.huami.account.ui.legal.BaseAgreementConfirmFragment.OnDialogListener
                public void onCancel() {
                    this.a.getOnCancel().invoke();
                }
            });
            userAgreementStartUpFragmentNewInstance.show(activity.getSupportFragmentManager());
        } else if (z) {
            this.onAgreeAll.invoke();
        } else {
            a(activity, index + 1);
        }
    }

    private final List<LegalInfoType> b() {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            List<String> listSplit$default = StringsKt__StringsKt.split$default((CharSequence) AnonymousKeeper.INSTANCE.getStartupAgreeTypes(), new String[]{","}, false, 0, 6, (Object) null);
            ArrayList arrayList = new ArrayList();
            for (String str : listSplit$default) {
                LegalInfoType legalInfoType = LegalInfoType.PRIVACY;
                if (!Intrinsics.areEqual(str, legalInfoType.getTypeName())) {
                    legalInfoType = LegalInfoType.AGREEMENT;
                    if (!Intrinsics.areEqual(str, legalInfoType.getTypeName())) {
                        legalInfoType = LegalInfoType.EXPERIENCE;
                        if (!Intrinsics.areEqual(str, legalInfoType.getTypeName())) {
                            legalInfoType = null;
                        }
                    }
                }
                if (legalInfoType != null) {
                    arrayList.add(legalInfoType);
                }
            }
            objM3845constructorimpl = Result.m3845constructorimpl(CollectionsKt___CollectionsKt.toList(arrayList));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        List<LegalInfoType> list = (List) (Result.m3850isFailureimpl(objM3845constructorimpl) ? null : objM3845constructorimpl);
        return list == null ? CollectionsKt__CollectionsKt.emptyList() : list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(LegalInfoType type) {
        List mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) b());
        mutableList.add(type);
        AnonymousKeeper.INSTANCE.setStartupAgreeTypes(CollectionsKt___CollectionsKt.joinToString$default(mutableList, ",", null, null, 0, null, a.a, 30, null));
    }

    @NotNull
    public final String getAreaCode() {
        return this.areaCode;
    }

    public final int getDelaySecond() {
        return this.delaySecond;
    }

    @NotNull
    public final Function0<Unit> getOnAgreeAll() {
        return this.onAgreeAll;
    }

    @NotNull
    public final Function0<Unit> getOnCancel() {
        return this.onCancel;
    }

    @NotNull
    public final List<LegalInfoType> getTypes() {
        return this.types;
    }

    public final boolean isAgreeAllTypes() {
        List<LegalInfoType> listB = b();
        List<LegalInfoType> list = this.types;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            if (!listB.contains((LegalInfoType) it2.next())) {
                return false;
            }
        }
        return true;
    }

    public final void show(@NotNull AppCompatActivity activity) {
        if (this.types.isEmpty()) {
            return;
        }
        a(activity, 0);
    }

    public /* synthetic */ StartupLegalDialog(String str, List list, int i, Function0 function0, Function0 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "CN" : str, (i2 & 2) != 0 ? CollectionsKt__CollectionsKt.listOf((Object[]) new LegalInfoType[]{LegalInfoType.AGREEMENT, LegalInfoType.PRIVACY}) : list, (i2 & 4) != 0 ? 3 : i, function0, function1);
    }
}
