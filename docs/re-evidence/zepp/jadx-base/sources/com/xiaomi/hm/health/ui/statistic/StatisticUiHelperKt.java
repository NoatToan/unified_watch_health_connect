package com.xiaomi.hm.health.ui.statistic;

import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.ui.statistic.StatisticUiHelperKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a*\u0010\u0007\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0018\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00030\u0002¨\u0006\b"}, d2 = {"Landroidx/fragment/app/FragmentActivity;", "activity", "", "Lkotlin/Pair;", "", "values", "", "showStatisticUi", "app_midongPlayRelease"}, k = 2, mv = {1, 5, 1})
public final class StatisticUiHelperKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(DialogInterface dialogInterface, int i) {
    }

    public static final void showStatisticUi(@Nullable FragmentActivity fragmentActivity, @NotNull List<Pair<String, String>> list) {
        if (fragmentActivity == null || fragmentActivity.isDestroyed() || fragmentActivity.isFinishing()) {
            return;
        }
        View viewInflate = LayoutInflater.from(fragmentActivity).inflate(R.layout.layout_statistic, (ViewGroup) null, false);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.recycle_view);
        recyclerView.setAdapter(new StatisticAdapter(list));
        recyclerView.setLayoutManager(new LinearLayoutManager(fragmentActivity));
        new AlertDialogFragment.Builder(fragmentActivity).setTitle("设备统计信息").setCancelable(false).setContentView(viewInflate).setNeutralButton(R.string.confirm, new DialogInterface.OnClickListener() { // from class: sf7
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                StatisticUiHelperKt.b(dialogInterface, i);
            }
        }).create().show(fragmentActivity.getSupportFragmentManager());
    }
}
