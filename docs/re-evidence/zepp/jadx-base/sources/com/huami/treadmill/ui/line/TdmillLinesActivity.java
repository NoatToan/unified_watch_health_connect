package com.huami.treadmill.ui.line;

import android.os.Bundle;
import androidx.core.content.ContextCompat;
import androidx.p008lifecycle.Observer;
import androidx.paging.PagedList;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.treadmill.R;
import com.huami.treadmill.ext.AppCompatActivityExtKt;
import com.huami.treadmill.ui.line.TdmillLinesActivity;
import com.huami.view.basetitle.BaseTitleActivity;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/huami/treadmill/ui/line/TdmillLinesActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "", "initRecyclerView", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/huami/treadmill/ui/line/TdmillLineViewModel;", "x", "Lcom/huami/treadmill/ui/line/TdmillLineViewModel;", "viewmodel", "<init>", "()V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final class TdmillLinesActivity extends BaseTitleActivity {

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private TdmillLineViewModel viewmodel;

    private final void initRecyclerView() {
        final TdLineAdapter tdLineAdapter = new TdLineAdapter();
        int i = R.id.recycler_view;
        RecyclerView recyclerView = (RecyclerView) findViewById(i);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(1);
        Unit unit = Unit.INSTANCE;
        recyclerView.setLayoutManager(linearLayoutManager);
        ((RecyclerView) findViewById(i)).setAdapter(tdLineAdapter);
        TdmillLineViewModel tdmillLineViewModel = this.viewmodel;
        Objects.requireNonNull(tdmillLineViewModel);
        tdmillLineViewModel.getTdmillLines().observe(this, new Observer() { // from class: xl7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                TdmillLinesActivity.m(tdLineAdapter, (PagedList) obj);
            }
        });
        TdmillLineViewModel tdmillLineViewModel2 = this.viewmodel;
        Objects.requireNonNull(tdmillLineViewModel2);
        tdmillLineViewModel2.showLines("10");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(TdLineAdapter tdLineAdapter, PagedList pagedList) {
        tdLineAdapter.submitList(pagedList);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tdmill_lines);
        BaseTitleActivity.STYLE style = BaseTitleActivity.STYLE.BACK_AND_TITLE;
        int i = R.color.s38;
        setStyle(style, ContextCompat.getColor(this, i), getString(R.string.tdmill_all_lines), true);
        int i2 = R.color.s1;
        setBaseTitleColor(ContextCompat.getColor(this, i2));
        setLeftImageRes(R.drawable.ic_arrow_back_20_2x, i2);
        setTitleBarBackgroundColor(ContextCompat.getColor(this, i));
        this.viewmodel = (TdmillLineViewModel) AppCompatActivityExtKt.obtainViewModel(this, TdmillLineViewModel.class);
        initRecyclerView();
    }
}
