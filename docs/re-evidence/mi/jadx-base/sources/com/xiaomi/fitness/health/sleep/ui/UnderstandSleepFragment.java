package com.xiaomi.fitness.health.sleep.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.fitness.health.sleep.utils.SleepDeviceHelper;
import com.xiaomi.fitness.health.sleep.view.AnchorScrollView;
import com.xiaomi.fitness.view.UnderstandItemView;
import defpackage.c0j;
import defpackage.eri;
import defpackage.jui;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public class UnderstandSleepFragment extends BaseFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AnchorScrollView f12275b;
    public boolean c;

    public void initContentView(View view) {
        setTitle(getString(c0j.Ck));
        UnderstandItemView understandItemView = (UnderstandItemView) view.findViewById(eri.to);
        if (!this.c) {
            understandItemView.setVisibility(8);
        }
        AnchorScrollView anchorScrollView = (AnchorScrollView) view.findViewById(eri.x);
        this.f12275b = anchorScrollView;
        anchorScrollView.post(new Runnable() { // from class: i9q
            @Override // java.lang.Runnable
            public final void run() {
                this.f20917a.w();
            }
        });
    }

    @Override // miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f12274a = arguments.getInt("index");
        }
        this.c = SleepDeviceHelper.INSTANCE.isSupportRem();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, defpackage.osc
    public View onInflateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Objects.requireNonNull(layoutInflater);
        return layoutInflater.inflate(jui.d2, viewGroup, false);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        initContentView(view);
    }

    public final /* synthetic */ void w() {
        this.f12275b.a(this.f12274a);
    }
}
