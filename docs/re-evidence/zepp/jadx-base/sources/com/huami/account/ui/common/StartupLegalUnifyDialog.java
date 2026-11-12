package com.huami.account.ui.common;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.AccountExternalsKt;
import com.huami.account.UserLegalInfoManager;
import com.huami.account.WebHelper;
import com.huami.account.bean.LegalInfoType;
import com.huami.account.keeper.AnonymousKeeper;
import com.huami.account.ui.R;
import com.huami.account.ui.common.StartupLegalUnifyDialog;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.tools.analytics.DbUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\u0018\u00002\u00020\u0001B/\b\u0007\u0012\b\b\u0002\u0010 \u001a\u00020\u0017\u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b*\u0010+J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J>\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002J\u0010\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0013H\u0002J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u0013H\u0002J\u000e\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u001b\u001a\u00020\u001aR\u0019\u0010 \u001a\u00020\u00178\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\"\u001a\u0004\b&\u0010$R\u001c\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010(¨\u0006,"}, d2 = {"Lcom/huami/account/ui/common/StartupLegalUnifyDialog;", "", "Landroidx/appcompat/app/AppCompatActivity;", "activity", "", "e", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/text/SpannableStringBuilder;", "style", "", "color", "start", "end", "Lkotlin/Function0;", "", "onClick", "g", "", "Lcom/huami/account/bean/LegalInfoType;", GoogleApiAvailabilityLight.a, "type", "f", "", "c", "show", "", "isAgreeAllTypes", "a", "Ljava/lang/String;", "getAreaCode", "()Ljava/lang/String;", "areaCode", "b", "Lkotlin/jvm/functions/Function0;", "getOnCancel", "()Lkotlin/jvm/functions/Function0;", "onCancel", "getOnAgree", "onAgree", "Ljava/util/List;", "needAgreeLegalTypes", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class StartupLegalUnifyDialog {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String areaCode;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Function0<Unit> onCancel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Function0<Unit> onAgree;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final List<LegalInfoType> needAgreeLegalTypes;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Unit> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            WebHelper.launch(StartupLegalUnifyDialog.this.c(LegalInfoType.AGREEMENT));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Unit> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            WebHelper.launch(StartupLegalUnifyDialog.this.c(LegalInfoType.PRIVACY));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Unit> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            WebHelper.launch(StartupLegalUnifyDialog.this.c(LegalInfoType.PRIVACY));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/account/bean/LegalInfoType;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<LegalInfoType, CharSequence> {
        public static final d a = new d();

        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(@NotNull LegalInfoType legalInfoType) {
            return legalInfoType.getTypeName();
        }
    }

    @JvmOverloads
    public StartupLegalUnifyDialog(@NotNull String str, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function1) {
        this.areaCode = str;
        this.onCancel = function0;
        this.onAgree = function1;
        this.needAgreeLegalTypes = CollectionsKt__CollectionsKt.listOf((Object[]) new LegalInfoType[]{LegalInfoType.AGREEMENT, LegalInfoType.PRIVACY});
    }

    @JvmOverloads
    public StartupLegalUnifyDialog(@NotNull Function0<Unit> function0, @NotNull Function0<Unit> function1) {
        this(null, function0, function1, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String c(LegalInfoType type) {
        return UserLegalInfoManager.getAgreementUrl(type, this.areaCode);
    }

    private final List<LegalInfoType> d() {
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

    private final CharSequence e(AppCompatActivity activity) {
        String string = AccountExternalsKt.getAppContext().getString(R.string.account_ui_startup_unify_title_agreement);
        String string2 = AccountExternalsKt.getAppContext().getString(R.string.account_ui_startup_unify_title_privacy);
        String string3 = AccountExternalsKt.getAppContext().getString(R.string.account_ui_startup_unify_content, string, string2, string2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string3);
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) string3, string, 0, false, 6, (Object) null);
        int length = iIndexOf$default + string.length();
        int iIndexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) string3, string2, 0, false, 6, (Object) null);
        int length2 = iIndexOf$default2 + string2.length();
        int iIndexOf$default3 = StringsKt__StringsKt.indexOf$default((CharSequence) string3, string2, length2, false, 4, (Object) null);
        int length3 = iIndexOf$default3 + string2.length();
        int i = R.color.account_ui_stp_blue;
        g(activity, spannableStringBuilder, i, iIndexOf$default, length, new a());
        g(activity, spannableStringBuilder, i, iIndexOf$default2, length2, new b());
        g(activity, spannableStringBuilder, i, iIndexOf$default3, length3, new c());
        return spannableStringBuilder;
    }

    private final void f(LegalInfoType type) {
        List mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) d());
        mutableList.add(type);
        AnonymousKeeper.INSTANCE.setStartupAgreeTypes(CollectionsKt___CollectionsKt.joinToString$default(mutableList, ",", null, null, 0, null, d.a, 30, null));
    }

    private final void g(final Context context, SpannableStringBuilder style, final int color, int start, int end, final Function0<Unit> onClick) {
        style.setSpan(new ClickableSpan() { // from class: com.huami.account.ui.common.StartupLegalUnifyDialog$setSpan$1
            @Override // android.text.style.ClickableSpan
            public void onClick(@NotNull View widget) {
                onClick.invoke();
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(@NotNull TextPaint ds) {
                super.updateDrawState(ds);
                ds.setColor(ContextCompat.getColor(context, color));
                ds.setUnderlineText(false);
            }
        }, start, end, 33);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(StartupLegalUnifyDialog startupLegalUnifyDialog, View view) {
        startupLegalUnifyDialog.getOnCancel().invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(StartupLegalUnifyDialog startupLegalUnifyDialog, AlertDialogFragment alertDialogFragment, View view) {
        Iterator<T> it2 = startupLegalUnifyDialog.needAgreeLegalTypes.iterator();
        while (it2.hasNext()) {
            startupLegalUnifyDialog.f((LegalInfoType) it2.next());
        }
        startupLegalUnifyDialog.getOnAgree().invoke();
        alertDialogFragment.dismiss();
    }

    @NotNull
    public final String getAreaCode() {
        return this.areaCode;
    }

    @NotNull
    public final Function0<Unit> getOnAgree() {
        return this.onAgree;
    }

    @NotNull
    public final Function0<Unit> getOnCancel() {
        return this.onCancel;
    }

    public final boolean isAgreeAllTypes() {
        List<LegalInfoType> listD = d();
        List<LegalInfoType> list = this.needAgreeLegalTypes;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            if (!listD.contains((LegalInfoType) it2.next())) {
                return false;
            }
        }
        return true;
    }

    public final void show(@NotNull AppCompatActivity activity) {
        if (isAgreeAllTypes()) {
            this.onAgree.invoke();
            return;
        }
        View viewInflate = View.inflate(activity, R.layout.account_ui_dialog_startup_unify, null);
        viewInflate.findViewById(R.id.tv_disagree).setOnClickListener(new View.OnClickListener() { // from class: jf7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StartupLegalUnifyDialog.h(this.a, view);
            }
        });
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_agreement_unify_content);
        textView.setText(e(activity));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setHighlightColor(0);
        final AlertDialogFragment alertDialogFragmentCreate = new AlertDialogFragment.Builder(activity).setContentView(viewInflate).create();
        alertDialogFragmentCreate.setCancelable(false);
        alertDialogFragmentCreate.setGravity(17);
        alertDialogFragmentCreate.show(activity.getSupportFragmentManager());
        viewInflate.findViewById(R.id.tv_agree).setOnClickListener(new View.OnClickListener() { // from class: kf7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StartupLegalUnifyDialog.i(this.a, alertDialogFragmentCreate, view);
            }
        });
    }

    public /* synthetic */ StartupLegalUnifyDialog(String str, Function0 function0, Function0 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "CN" : str, function0, function1);
    }
}
