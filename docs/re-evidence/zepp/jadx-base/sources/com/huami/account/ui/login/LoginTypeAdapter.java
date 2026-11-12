package com.huami.account.ui.login;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.ui.R;
import com.huami.account.ui.login.LoginTypeAdapter;
import com.huami.account.ui.login.viewmodel.LoginViewModel;
import com.huami.passport.IAccount;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b-\u0010.J\u001d\u0010\t\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\fH\u0016J\b\u0010\u0012\u001a\u00020\fH\u0016R\u0019\u0010\u0018\u001a\u00020\u00138\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR=\u0010(\u001a\u001d\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u00060\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R4\u0010,\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00060\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010#\u001a\u0004\b*\u0010%\"\u0004\b+\u0010'¨\u0006/"}, d2 = {"Lcom/huami/account/ui/login/LoginTypeAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/huami/account/ui/login/LoginTypeViewHolder;", "", "Lcom/huami/account/ui/login/viewmodel/LoginViewModel$LoginType;", "loginTypes", "", "setLoginTypes$accountui_release", "(Ljava/util/List;)V", "setLoginTypes", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "holder", "position", "onBindViewHolder", "getItemCount", "Landroid/app/Activity;", "a", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "activity", "b", "Ljava/util/List;", "c", "otherTypes", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "provider", GoogleApiAvailabilityLight.a, "Lkotlin/jvm/functions/Function1;", "getOnLoginTypeClickListener", "()Lkotlin/jvm/functions/Function1;", "setOnLoginTypeClickListener", "(Lkotlin/jvm/functions/Function1;)V", "onLoginTypeClickListener", "e", "getOnOtherClickListener", "setOnOtherClickListener", "onOtherClickListener", "<init>", "(Landroid/app/Activity;)V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class LoginTypeAdapter extends RecyclerView.Adapter<LoginTypeViewHolder> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Activity activity;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private List<LoginViewModel.LoginType> loginTypes = CollectionsKt__CollectionsKt.emptyList();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private List<LoginViewModel.LoginType> otherTypes = CollectionsKt__CollectionsKt.emptyList();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private Function1<? super String, Unit> onLoginTypeClickListener = a.a;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private Function1<? super List<LoginViewModel.LoginType>, Unit> onOtherClickListener = b.a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<String, Unit> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull String str) {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "Lcom/huami/account/ui/login/viewmodel/LoginViewModel$LoginType;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<List<? extends LoginViewModel.LoginType>, Unit> {
        public static final b a = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends LoginViewModel.LoginType> list) {
            invoke2((List<LoginViewModel.LoginType>) list);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull List<LoginViewModel.LoginType> list) {
        }
    }

    public LoginTypeAdapter(@NotNull Activity activity) {
        this.activity = activity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(String str, LoginTypeAdapter loginTypeAdapter, View view) {
        if (Intrinsics.areEqual(str, IAccount.PROVIDER_UNKOWN)) {
            loginTypeAdapter.getOnOtherClickListener().invoke(loginTypeAdapter.otherTypes);
        } else {
            loginTypeAdapter.getOnLoginTypeClickListener().invoke(str);
        }
    }

    @NotNull
    public final Activity getActivity() {
        return this.activity;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getPagerCount() {
        return this.loginTypes.size();
    }

    @NotNull
    public final Function1<String, Unit> getOnLoginTypeClickListener() {
        return this.onLoginTypeClickListener;
    }

    @NotNull
    public final Function1<List<LoginViewModel.LoginType>, Unit> getOnOtherClickListener() {
        return this.onOtherClickListener;
    }

    public final void setLoginTypes$accountui_release(@NotNull List<LoginViewModel.LoginType> loginTypes) {
        if (loginTypes.size() <= 4) {
            this.loginTypes = loginTypes;
            return;
        }
        this.loginTypes = CollectionsKt___CollectionsKt.plus((Collection) CollectionsKt___CollectionsKt.take(loginTypes, 3), (Iterable) e.listOf(new LoginViewModel.LoginType(IAccount.PROVIDER_UNKOWN, R.drawable.account_ui_logo_more)));
        this.otherTypes = loginTypes.subList(3, loginTypes.size());
    }

    public final void setOnLoginTypeClickListener(@NotNull Function1<? super String, Unit> function1) {
        this.onLoginTypeClickListener = function1;
    }

    public final void setOnOtherClickListener(@NotNull Function1<? super List<LoginViewModel.LoginType>, Unit> function1) {
        this.onOtherClickListener = function1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull LoginTypeViewHolder holder, int position) {
        LoginViewModel.LoginType loginType = this.loginTypes.get(position);
        final String provider = loginType.getProvider();
        holder.getLoginTypeLogo().setImageResource(loginType.getLogoRes());
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: qs4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoginTypeAdapter.b(provider, this, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public LoginTypeViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        return new LoginTypeViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.account_ui_item_login_btn_third, parent, false));
    }
}
