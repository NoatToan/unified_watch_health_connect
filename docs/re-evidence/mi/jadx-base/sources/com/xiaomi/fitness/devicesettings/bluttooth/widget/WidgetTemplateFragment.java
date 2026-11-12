package com.xiaomi.fitness.devicesettings.bluttooth.widget;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.common.log.Logger;
import defpackage.cji;
import defpackage.dkr;
import defpackage.ekr;
import defpackage.eui;
import defpackage.p8h;
import defpackage.wj6;
import defpackage.wzi;
import defpackage.zqi;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 02\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00010B\u0007¢\u0006\u0004\b/\u0010\nJ\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0013\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!R\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010&\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R*\u0010*\u001a\u0016\u0012\u0004\u0012\u00020\u0015\u0018\u00010(j\n\u0012\u0004\u0012\u00020\u0015\u0018\u0001`)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00061"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/WidgetTemplateFragment;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/BaseWidgetBindingFragment;", "Lwj6;", "Lp8h;", "Landroid/view/View;", "view", "", "initContentView", "(Landroid/view/View;)V", "initTemplateList", "()V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "obj", "onItemClick", "(Landroid/view/View;Ljava/lang/Object;)V", "", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "Landroidx/recyclerview/widget/RecyclerView;", "mRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "Ldkr;", "mAdapter", "Ldkr;", "", "Lekr;", "mList", "Ljava/util/List;", "mWidgetGroupSequence", "I", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "supportedStyleList", "Ljava/util/ArrayList;", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class WidgetTemplateFragment extends Hilt_WidgetTemplateFragment<wj6> implements p8h {

    @NotNull
    public static final String KEY_WIDGET_GROUP_SEQUENCE = "widget_group_sequence";

    @NotNull
    public static final String TAG = "WidgetTemplateFragment";

    @NotNull
    public static final String sKeySupportedWidgetGroupStyles = "sKeySupportedWidgetGroupStyles";
    public static final int sRequestCodeEdit = 100;
    private dkr mAdapter;

    @NotNull
    private List<ekr> mList = new ArrayList();
    private RecyclerView mRecyclerView;
    private int mWidgetGroupSequence;

    @Nullable
    private ArrayList<Integer> supportedStyleList;

    private final void initContentView(View view) {
        setTitleBackground(cji.x);
        this.mRecyclerView = (RecyclerView) view.findViewById(zqi.H7);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getMActivity(), 2);
        RecyclerView recyclerView = this.mRecyclerView;
        dkr dkrVar = null;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRecyclerView");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(gridLayoutManager);
        dkr dkrVar2 = new dkr();
        this.mAdapter = dkrVar2;
        dkrVar2.l(this);
        RecyclerView recyclerView2 = this.mRecyclerView;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRecyclerView");
            recyclerView2 = null;
        }
        dkr dkrVar3 = this.mAdapter;
        if (dkrVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        } else {
            dkrVar = dkrVar3;
        }
        recyclerView2.setAdapter(dkrVar);
    }

    private final void initTemplateList() {
        this.mList = new LinkedList();
        ArrayList<Integer> arrayList = this.supportedStyleList;
        if (arrayList != null && arrayList.isEmpty()) {
            Logger.e(TAG, "initTemplateList: has no SupportedWidgetGroupStyles");
            return;
        }
        for (int i = 1; i < 16; i++) {
            ekr ekrVarA = ekr.a(i);
            Intrinsics.checkNotNullExpressionValue(ekrVarA, "create(...)");
            ArrayList<Integer> arrayList2 = this.supportedStyleList;
            if (arrayList2 != null && arrayList2.contains(Integer.valueOf(ekrVarA.b()))) {
                this.mList.add(ekrVarA);
            }
        }
        dkr dkrVar = this.mAdapter;
        dkr dkrVar2 = null;
        if (dkrVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            dkrVar = null;
        }
        dkrVar.setList(this.mList);
        dkr dkrVar3 = this.mAdapter;
        if (dkrVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        } else {
            dkrVar2 = dkrVar3;
        }
        dkrVar2.notifyDataSetChanged();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return eui.R0;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 100 && resultCode == -1) {
            FragmentActivity mActivity = getMActivity();
            if (mActivity != null) {
                mActivity.setResult(-1);
            }
            finish();
        }
    }

    @Override // miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.mWidgetGroupSequence = arguments.getInt("widget_group_sequence");
            this.supportedStyleList = arguments.getIntegerArrayList(sKeySupportedWidgetGroupStyles);
        }
    }

    @Override // defpackage.p8h
    public void onItemClick(@Nullable View view, @NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj instanceof ekr) {
            Bundle bundle = new Bundle();
            bundle.putInt(WidgetGroupEditFragment.KEY_WIDGET_GROUP_STYLE, ((ekr) obj).b());
            bundle.putString("origin", WidgetGroupEditFragment.ORIGIN_PAGE_TEMPLATE);
            bundle.putInt("widget_group_sequence", this.mWidgetGroupSequence);
            BaseFragmentExKt.gotoPageForResult(this, (Class<?>) WidgetGroupEditFragment.class, bundle, 100);
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initContentView(view);
        setTitle(wzi.ea);
        initTemplateList();
    }
}
