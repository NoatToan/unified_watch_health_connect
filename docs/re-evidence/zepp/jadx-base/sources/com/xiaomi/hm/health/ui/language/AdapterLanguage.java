package com.xiaomi.hm.health.ui.language;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.UserLegalInfoManager;
import com.huami.devicex.R;
import com.xiaomi.hm.health.device.watchskinstore.ui.LargeWatchSkinActivity;
import com.xiaomi.hm.health.ui.language.AdapterLanguage;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001+B\u0007¢\u0006\u0004\b)\u0010*J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0018\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0002J\u001c\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0003H\u0016J\b\u0010\u0010\u001a\u00020\u0003H\u0016J\u001c\u0010\u0012\u001a\u00020\u00072\n\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R6\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u001dR\u0018\u0010 \u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001fR$\u0010(\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006,"}, d2 = {"Lcom/xiaomi/hm/health/ui/language/AdapterLanguage;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/hm/health/ui/language/AdapterLanguage$ViewHolderLanguage;", "", "position", "", "isChecked", "", "b", "Landroid/view/View;", "itemView", "c", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "getItemCount", "holder", "onBindViewHolder", "", "Lcom/xiaomi/hm/health/ui/language/LanguageBean;", "value", "a", "Ljava/util/List;", "getSupportLanguage", "()Ljava/util/List;", "setSupportLanguage", "(Ljava/util/List;)V", "supportLanguage", LogUtil.I, "lastCheckedPosition", "Landroid/view/View;", "lastSelectItemView", "Landroid/view/View$OnClickListener;", GoogleApiAvailabilityLight.a, "Landroid/view/View$OnClickListener;", "getOnItemListener", "()Landroid/view/View$OnClickListener;", "setOnItemListener", "(Landroid/view/View$OnClickListener;)V", "onItemListener", "<init>", "()V", "ViewHolderLanguage", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class AdapterLanguage extends RecyclerView.Adapter<ViewHolderLanguage> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private List<LanguageBean> supportLanguage = new ArrayList();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int lastCheckedPosition = -1;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private View lastSelectItemView;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private View.OnClickListener onItemListener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u001d\u0010\r\u001a\u00020\b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0010\u001a\u00020\u000e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\t\u0010\u000f¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/hm/health/ui/language/AdapterLanguage$ViewHolderLanguage;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/xiaomi/hm/health/ui/language/LanguageBean;", LargeWatchSkinActivity.KEY_BEAN, "", "position", "", "bindData", "Landroid/widget/TextView;", "a", "Lkotlin/Lazy;", "b", "()Landroid/widget/TextView;", UserLegalInfoManager.KEY_LANGUAGE, "Landroid/widget/CheckBox;", "()Landroid/widget/CheckBox;", "checkBox", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/hm/health/ui/language/AdapterLanguage;Landroid/view/View;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public final class ViewHolderLanguage extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final Lazy language;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final Lazy checkBox;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/widget/CheckBox;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<CheckBox> {
            public final /* synthetic */ View a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(View view) {
                super(0);
                this.a = view;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CheckBox invoke() {
                return (CheckBox) this.a.findViewById(R.id.state_check);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<TextView> {
            public final /* synthetic */ View a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(View view) {
                super(0);
                this.a = view;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final TextView invoke() {
                return (TextView) this.a.findViewById(R.id.language);
            }
        }

        public ViewHolderLanguage(View view) {
            super(view);
            this.language = LazyKt__LazyJVMKt.lazy(new b(view));
            this.checkBox = LazyKt__LazyJVMKt.lazy(new a(view));
        }

        private final CheckBox a() {
            return (CheckBox) this.checkBox.getValue();
        }

        private final TextView b() {
            return (TextView) this.language.getValue();
        }

        public final void bindData(@NotNull LanguageBean bean, int position) {
            b().setText(bean.getLanguageName());
            a().setChecked(bean.isChecked());
            a().setTag(bean);
            if (bean.isChecked()) {
                AdapterLanguage.this.lastCheckedPosition = position;
                AdapterLanguage.this.lastSelectItemView = this.itemView;
            }
        }
    }

    private final void b(int position, boolean isChecked) {
        if (position >= this.supportLanguage.size() || position < 0) {
            return;
        }
        this.supportLanguage.get(position).setChecked(isChecked);
    }

    private final void c(int position, View itemView) {
        int i = this.lastCheckedPosition;
        if (i == position) {
            return;
        }
        Integer numValueOf = Integer.valueOf(i);
        if (!(numValueOf.intValue() != -1)) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            b(numValueOf.intValue(), false);
            View view = this.lastSelectItemView;
            CheckBox checkBox = view != null ? (CheckBox) view.findViewById(R.id.state_check) : null;
            if (checkBox != null) {
                checkBox.setChecked(false);
            }
        }
        b(position, true);
        ((CheckBox) itemView.findViewById(R.id.state_check)).setChecked(true);
        this.lastCheckedPosition = position;
        this.lastSelectItemView = itemView;
        View.OnClickListener onClickListener = this.onItemListener;
        if (onClickListener == null) {
            return;
        }
        onClickListener.onClick(itemView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(AdapterLanguage adapterLanguage, int i, View view) {
        adapterLanguage.c(i, view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getA() {
        return this.supportLanguage.size();
    }

    @Nullable
    public final View.OnClickListener getOnItemListener() {
        return this.onItemListener;
    }

    @NotNull
    public final List<LanguageBean> getSupportLanguage() {
        return this.supportLanguage;
    }

    public final void setOnItemListener(@Nullable View.OnClickListener onClickListener) {
        this.onItemListener = onClickListener;
    }

    public final void setSupportLanguage(@NotNull List<LanguageBean> list) {
        this.supportLanguage.clear();
        this.supportLanguage.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolderLanguage holder, final int position) {
        holder.bindData(this.supportLanguage.get(position), position);
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: f7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AdapterLanguage.d(this.a, position, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolderLanguage onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        return new ViewHolderLanguage(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_setting_languge, parent, false));
    }
}
