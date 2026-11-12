package com.xiaomi.fitness.homepage.viewholder;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.xiaomi.fitness.active.pk.export.ActivePkPageExtKt;
import com.xiaomi.fitness.active.pk.export.IPkExport;
import com.xiaomi.fitness.homepage.viewholder.ActivePkBannerViewHolder;
import defpackage.nf2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/homepage/viewholder/ActivePkBannerViewHolder;", "Lnf2;", "Landroid/content/Context;", "context", "", "dataObject", "", "bindData", "(Landroid/content/Context;Ljava/lang/String;)V", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class ActivePkBannerViewHolder extends nf2 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivePkBannerViewHolder(@NotNull final View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        itemView.setOnClickListener(new View.OnClickListener() { // from class: ff0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActivePkBannerViewHolder._init_$lambda$0(itemView, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(View itemView, View view) {
        Intrinsics.checkNotNullParameter(itemView, "$itemView");
        IPkExport instance = ActivePkPageExtKt.getINSTANCE(IPkExport.INSTANCE);
        Context context = itemView.getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
        instance.goToSendInvitationActivity((Activity) context, null);
    }

    public final void bindData(@NotNull Context context, @NotNull String dataObject) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dataObject, "dataObject");
    }
}
