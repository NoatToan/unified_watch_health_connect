package com.huami.moving.ui.sport.detail.segment.search;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.moving.R;
import com.huami.moving.model.StrengthTrainingAction;
import com.huami.moving.ui.GlobalTitleStyle;
import com.huami.moving.ui.adapter.STActionAdapter;
import com.huami.moving.ui.sport.detail.segment.search.STActionSearchActivity;
import com.huami.moving.utils.StrenthTrainingUtils;
import com.huami.view.basetitle.BaseTitleActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0001!B\u0007¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0003J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\""}, d2 = {"Lcom/huami/moving/ui/sport/detail/segment/search/STActionSearchActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "Lcom/huami/moving/ui/adapter/STActionAdapter$SelectListener;", "", "initView", "initData", GoogleApiAvailabilityLight.b, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "", "actionType", "doSelect", "Landroid/widget/EditText;", "x", "Landroid/widget/EditText;", "etSearch", "Landroid/widget/TextView;", "y", "Landroid/widget/TextView;", "tvSearchCancel", "z", "tvSearchText", "Landroidx/recyclerview/widget/RecyclerView;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Landroidx/recyclerview/widget/RecyclerView;", "rvAction", "Lcom/huami/moving/ui/adapter/STActionAdapter;", "B", "Lcom/huami/moving/ui/adapter/STActionAdapter;", "mSTActionAdapter", "<init>", "()V", "Companion", "moving_release"}, k = 1, mv = {1, 5, 1})
public final class STActionSearchActivity extends BaseTitleActivity implements STActionAdapter.SelectListener {

    @NotNull
    public static final String ACTION_TYPE = "actionType";

    @NotNull
    public static final String TAG = "STActionSearchActivity";

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private RecyclerView rvAction;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private STActionAdapter mSTActionAdapter;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private EditText etSearch;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private TextView tvSearchCancel;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private TextView tvSearchText;

    @SuppressLint({"NotifyDataSetChanged"})
    private final void initData() {
        final ArrayList arrayList = new ArrayList();
        Iterator<StrengthTrainingAction> it2 = StrenthTrainingUtils.INSTANCE.findStrenthTrainingByType(this, -1).iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next());
        }
        RecyclerView recyclerView = this.rvAction;
        Objects.requireNonNull(recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        STActionAdapter sTActionAdapter = new STActionAdapter(this, arrayList);
        this.mSTActionAdapter = sTActionAdapter;
        RecyclerView recyclerView2 = this.rvAction;
        Objects.requireNonNull(recyclerView2);
        Objects.requireNonNull(sTActionAdapter);
        recyclerView2.setAdapter(sTActionAdapter);
        RecyclerView recyclerView3 = this.rvAction;
        Objects.requireNonNull(recyclerView3);
        recyclerView3.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.huami.moving.ui.sport.detail.segment.search.STActionSearchActivity.initData.2
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(@NotNull RecyclerView recyclerView4, int dx, int dy) {
                super.onScrolled(recyclerView4, dx, dy);
                RecyclerView recyclerView5 = STActionSearchActivity.this.rvAction;
                Objects.requireNonNull(recyclerView5);
                RecyclerView.LayoutManager layoutManager = recyclerView5.getLayoutManager();
                Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                int iFindFirstVisibleItemPosition = ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
                TextView textView = STActionSearchActivity.this.tvSearchText;
                Objects.requireNonNull(textView);
                int i = 0;
                if (dy <= 0 && iFindFirstVisibleItemPosition == 0) {
                    i = 8;
                }
                textView.setVisibility(i);
            }
        });
        STActionAdapter sTActionAdapter2 = this.mSTActionAdapter;
        Objects.requireNonNull(sTActionAdapter2);
        sTActionAdapter2.setSelectListener(this);
        TextView textView = this.tvSearchCancel;
        Objects.requireNonNull(textView);
        textView.setOnClickListener(new View.OnClickListener() { // from class: ah6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                STActionSearchActivity.o(this.a, arrayList, view);
            }
        });
        EditText editText = this.etSearch;
        Objects.requireNonNull(editText);
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: bh6
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView2, int i, KeyEvent keyEvent) {
                return STActionSearchActivity.p(this.a, arrayList, textView2, i, keyEvent);
            }
        });
    }

    private final void initView() {
        this.etSearch = (EditText) findViewById(R.id.et_search);
        this.tvSearchCancel = (TextView) findViewById(R.id.tv_search_cancel);
        this.tvSearchText = (TextView) findViewById(R.id.tv_search_text);
        this.rvAction = (RecyclerView) findViewById(R.id.rv_action);
    }

    private final void n() {
        Object systemService = getSystemService("input_method");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        if (!inputMethodManager.isActive() || getCurrentFocus() == null || getCurrentFocus().getWindowToken() == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(STActionSearchActivity sTActionSearchActivity, List list, View view) {
        sTActionSearchActivity.n();
        EditText editText = sTActionSearchActivity.etSearch;
        Objects.requireNonNull(editText);
        editText.getText().clear();
        STActionAdapter sTActionAdapter = sTActionSearchActivity.mSTActionAdapter;
        Objects.requireNonNull(sTActionAdapter);
        sTActionAdapter.setSearchResultList(list);
        STActionAdapter sTActionAdapter2 = sTActionSearchActivity.mSTActionAdapter;
        Objects.requireNonNull(sTActionAdapter2);
        sTActionAdapter2.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean p(STActionSearchActivity sTActionSearchActivity, List list, TextView textView, int i, KeyEvent keyEvent) {
        if (i == 3 || i == 6 || (keyEvent != null && 66 == keyEvent.getKeyCode() && keyEvent.getAction() == 0)) {
            sTActionSearchActivity.n();
            ArrayList arrayList = new ArrayList();
            EditText editText = sTActionSearchActivity.etSearch;
            Objects.requireNonNull(editText);
            String string = editText.getText().toString();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                StrengthTrainingAction strengthTrainingAction = (StrengthTrainingAction) it2.next();
                if (StringsKt__StringsKt.contains$default((CharSequence) strengthTrainingAction.getActionName(), (CharSequence) string, false, 2, (Object) null)) {
                    arrayList.add(strengthTrainingAction);
                }
            }
            STActionAdapter sTActionAdapter = sTActionSearchActivity.mSTActionAdapter;
            Objects.requireNonNull(sTActionAdapter);
            sTActionAdapter.setSearchResultList(arrayList);
            STActionAdapter sTActionAdapter2 = sTActionSearchActivity.mSTActionAdapter;
            Objects.requireNonNull(sTActionAdapter2);
            sTActionAdapter2.notifyDataSetChanged();
        }
        return false;
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.moving.ui.adapter.STActionAdapter.SelectListener
    public void doSelect(int actionType) {
        Intent intent = new Intent();
        intent.putExtra("actionType", actionType);
        setResult(-1, intent);
        finish();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_st_action_search);
        GlobalTitleStyle.setUnifyTitleStyle$default(this, getString(R.string.strength_training_choose_exercise), null, 2, null);
        initView();
        initData();
    }
}
