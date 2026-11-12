package com.huami.device.feature.health.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.device.feature.health.ui.view.RecycleFixedListTile;
import com.huami.lib.rainbow.ListTile;
import com.huami.passport.Configs;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\r"}, d2 = {"Lcom/huami/device/feature/health/ui/view/RecycleFixedListTile;", "Lcom/huami/lib/rainbow/ListTile;", "", Configs.Params.RESET, "Landroid/widget/CompoundButton$OnCheckedChangeListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnCheckedChangeListener", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "health-ui_release"}, k = 1, mv = {1, 5, 1})
public final class RecycleFixedListTile extends ListTile {
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public RecycleFixedListTile(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }

    public /* synthetic */ RecycleFixedListTile(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setOnCheckedChangeListener$lambda-0, reason: not valid java name */
    public static final void m3331setOnCheckedChangeListener$lambda0(View view) {
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.lib.rainbow.ListTile
    public void reset() {
    }

    @Override // com.huami.lib.rainbow.ListTile
    public void setOnCheckedChangeListener(@Nullable CompoundButton.OnCheckedChangeListener listener) {
        super.setOnCheckedChangeListener(listener);
        setOnClickListener(new View.OnClickListener() { // from class: ca6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RecycleFixedListTile.m3331setOnCheckedChangeListener$lambda0(view);
            }
        });
    }

    @JvmOverloads
    public RecycleFixedListTile(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
