package com.xiaomi.fitness.devicesettings.bluttooth.music;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.b;
import com.xiaomi.fitness.baseui.view.BaseBindingActivity;
import com.xiaomi.fitness.baseui.view.IActionBar;
import com.xiaomi.fitness.devicesettings.bluttooth.music.MusicPushActivity;
import defpackage.eui;
import defpackage.fd6;
import defpackage.jni;
import defpackage.wc0;
import defpackage.wzi;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/music/MusicPushActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/music/MusicPushViewModel;", "Lfd6;", "", "bindView", "(Lfd6;)V", "", "isShow", "showOrHidenEndView", "(Z)V", "", "", "titles", "Ljava/util/List;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/music/MusicListFragment;", "fragments", "", "supportType", "I", "getLayoutId", "()I", "layoutId", "getViewModelId", "viewModelId", "<init>", "()V", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class MusicPushActivity extends BaseBindingActivity<MusicPushViewModel, fd6> {

    @NotNull
    public static final String sSupportType = "sSupportType";
    private int supportType;

    @NotNull
    private List<String> titles = new ArrayList();

    @NotNull
    private List<MusicListFragment> fragments = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$0(MusicPushActivity this$0, fd6 this_bindView, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        this$0.fragments.get(this_bindView.B.getCurrentItem()).onSaveBtnClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$4(MusicPushActivity this$0, TabLayout.g tab, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(tab, "tab");
        tab.v(this$0.titles.get(i));
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull final fd6 fd6Var) {
        View endView;
        Intrinsics.checkNotNullParameter(fd6Var, "<this>");
        this.supportType = getIntent().getIntExtra(sSupportType, 1);
        setTitle(wzi.o6);
        IActionBar.DefaultImpls.setEndView$default(this, 0, jni.f1, getString(wzi.sf), new View.OnClickListener() { // from class: rbg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MusicPushActivity.bindView$lambda$0(this.f32380a, fd6Var, view);
            }
        }, 1, null);
        wc0 miuiActionBar = getMiuiActionBar();
        if (miuiActionBar != null && (endView = miuiActionBar.getEndView()) != null) {
            endView.setVisibility(8);
        }
        this.titles.clear();
        this.fragments.clear();
        List<String> list = this.titles;
        String string = getString(wzi.z5);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        list.add(string);
        List<String> list2 = this.titles;
        String string2 = getString(wzi.f7);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        list2.add(string2);
        List<String> list3 = this.titles;
        String string3 = getString(wzi.Q);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        list3.add(string3);
        MusicListFragment musicListFragment = new MusicListFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(MusicListFragment.sSupportMusicType, this.supportType);
        bundle.putInt("sType", 0);
        musicListFragment.setArguments(bundle);
        MusicListFragment musicListFragment2 = new MusicListFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putInt(MusicListFragment.sSupportMusicType, this.supportType);
        bundle2.putInt("sType", 1);
        musicListFragment2.setArguments(bundle2);
        MusicListFragment musicListFragment3 = new MusicListFragment();
        Bundle bundle3 = new Bundle();
        bundle3.putInt(MusicListFragment.sSupportMusicType, this.supportType);
        bundle3.putInt("sType", 2);
        musicListFragment3.setArguments(bundle3);
        this.fragments.add(musicListFragment);
        this.fragments.add(musicListFragment2);
        this.fragments.add(musicListFragment3);
        fd6Var.B.setOffscreenPageLimit(this.fragments.size());
        ViewPager2 viewPager2 = fd6Var.B;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        Lifecycle lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        viewPager2.setAdapter(new MusicFragmentAdapter(supportFragmentManager, lifecycle, this.fragments, this.titles));
        new b(fd6Var.A, fd6Var.B, new b.InterfaceC0219b() { // from class: sbg
            @Override // com.google.android.material.tabs.b.InterfaceC0219b
            public final void a(TabLayout.g gVar, int i) {
                MusicPushActivity.bindView$lambda$4(this.f33485a, gVar, i);
            }
        }).a();
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return eui.f;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return 0;
    }

    public final void showOrHidenEndView(boolean isShow) {
        View endView;
        wc0 miuiActionBar = getMiuiActionBar();
        if (miuiActionBar == null || (endView = miuiActionBar.getEndView()) == null) {
            return;
        }
        endView.setVisibility(isShow ? 0 : 8);
    }
}
