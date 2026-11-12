package com.huami.components.devicestatus;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p008lifecycle.ViewModelProviders;
import com.huami.widget.tipcomponent.TipComponent;

/* JADX INFO: loaded from: classes6.dex */
public class DeviceStatusFragment extends Fragment {
    private TipComponent a;
    private EnableChangeListener b;
    private DeviceStatusViewModel d;
    private DeviceStatusNavigator e;
    private DeviceStatusStringProvider f;
    private boolean c = true;
    private BroadcastReceiver g = new b();

    public class a implements ViewModelProvider.Factory {
        public final /* synthetic */ DeviceStatusDelegate a;

        public a(DeviceStatusDelegate deviceStatusDelegate) {
            this.a = deviceStatusDelegate;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        @NonNull
        public <T extends ViewModel> T create(@NonNull Class<T> cls) {
            return new DeviceStatusViewModel(this.a);
        }
    }

    public class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (TextUtils.equals("android.bluetooth.adapter.action.STATE_CHANGED", intent.getAction())) {
                int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE);
                if (intExtra == 10 || intExtra == 12) {
                    DeviceStatusFragment.this.d.refresh();
                }
            }
        }
    }

    private void A(CharSequence charSequence) {
        TipComponent tipComponent = this.a;
        if (tipComponent != null) {
            tipComponent.clear();
            t(true);
            this.a.setTitle(charSequence);
            this.a.startLoading();
        }
    }

    private void B() {
        if (getContext() == null) {
            return;
        }
        getContext().unregisterReceiver(this.g);
    }

    private void C(CharSequence charSequence) {
        TipComponent tipComponent = this.a;
        if (tipComponent != null) {
            if (!tipComponent.isLoading()) {
                this.a.clear();
                t(true);
                this.a.startLoading();
            }
            this.a.setTitle(charSequence);
        }
    }

    private void initViewModel() {
        if (getActivity() == null) {
            return;
        }
        DeviceStatusViewModel deviceStatusViewModel = (DeviceStatusViewModel) ViewModelProviders.of(getActivity(), new a(DeviceStatusDelegate.getInstance())).get(DeviceStatusViewModel.class);
        this.d = deviceStatusViewModel;
        deviceStatusViewModel.a.observe(this, new Observer() { // from class: y91
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.j((Boolean) obj);
            }
        });
        this.d.b.observe(this, new Observer() { // from class: x91
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.k((Boolean) obj);
            }
        });
        this.d.c.observe(this, new Observer() { // from class: com.huami.components.devicestatus.k
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.l((DeviceStatusViewModel.c) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(Boolean bool) {
        r(bool != null ? bool.booleanValue() : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(Boolean bool) {
        t(bool != null ? bool.booleanValue() : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(DeviceStatusViewModel.c cVar) {
        if (cVar == null) {
            return;
        }
        if (cVar.a) {
            x();
            return;
        }
        if (cVar.b) {
            w();
            return;
        }
        if (cVar.c) {
            showConnecting();
            return;
        }
        if (cVar.d) {
            v();
            return;
        }
        if (cVar.e) {
            z();
            return;
        }
        if (cVar.f) {
            y();
            return;
        }
        if (cVar.g != null) {
            DeviceStatusStringProvider deviceStatusStringProvider = this.f;
            Context context = getContext();
            Integer num = cVar.g;
            C(deviceStatusStringProvider.getSynchronizingDataText(context, num != null ? num.intValue() : 0));
            return;
        }
        if (cVar.h != null) {
            DeviceStatusStringProvider deviceStatusStringProvider2 = this.f;
            Context context2 = getContext();
            Integer num2 = cVar.g;
            C(deviceStatusStringProvider2.getSynchronizingAGPSText(context2, num2 != null ? num2.intValue() : 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(View view) {
        showConnecting();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(View view) {
        DeviceStatusNavigator deviceStatusNavigator = this.e;
        if (deviceStatusNavigator != null) {
            deviceStatusNavigator.goToHelpPage(getActivity());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o(View view) {
        l.a(getActivity(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p(View view) {
        this.d.startSyncData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(View view) {
        DeviceStatusNavigator deviceStatusNavigator = this.e;
        if (deviceStatusNavigator != null) {
            deviceStatusNavigator.goToHelpPage(getActivity());
        }
    }

    private void r(boolean z) {
        EnableChangeListener enableChangeListener = this.b;
        if (enableChangeListener != null) {
            if (z != this.c) {
                enableChangeListener.onEnableChange(z);
            }
            this.c = z;
        }
    }

    private void s() {
        if (getContext() == null) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        getContext().registerReceiver(this.g, intentFilter);
    }

    private void showConnecting() {
        r(false);
        A(this.f.getConnectingText(getContext()));
    }

    private void stopLoading() {
        TipComponent tipComponent = this.a;
        if (tipComponent != null) {
            tipComponent.stopLoading();
        }
    }

    private void t(boolean z) {
        TipComponent tipComponent = this.a;
        if (tipComponent != null) {
            tipComponent.setVisibility(z ? 0 : 8);
            if (z) {
                return;
            }
            stopLoading();
        }
    }

    private void u(CharSequence charSequence, CharSequence charSequence2) {
        if (this.a != null) {
            t(true);
            this.a.clear();
            this.a.setWarningStyle(charSequence, charSequence2);
        }
    }

    private void v() {
        r(false);
        if (this.a != null) {
            u(this.f.getConnectFailedText(getContext()), this.f.getHelpText(getContext()));
            this.a.setActionRetry(new View.OnClickListener() { // from class: t91
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.m(view);
                }
            });
            this.a.setOnClickListener(new View.OnClickListener() { // from class: v91
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.n(view);
                }
            });
        }
    }

    private void w() {
        r(false);
        String unboundTextForFunction = this.f.getUnboundTextForFunction(getContext());
        if (this.b == null || TextUtils.isEmpty(unboundTextForFunction)) {
            return;
        }
        u(unboundTextForFunction, null);
    }

    private void x() {
        r(false);
        if (this.a != null) {
            t(true);
            this.a.clear();
            this.a.setWarningStyle(this.f.getBluetoothOffText(getContext()), null);
            this.a.setActionGoto(new View.OnClickListener() { // from class: s91
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.o(view);
                }
            });
        }
    }

    private void y() {
        stopLoading();
        if (this.a != null) {
            u(this.f.getSyncAGPSFailedText(getContext()), null);
        }
    }

    private void z() {
        stopLoading();
        if (this.a != null) {
            u(this.f.getSyncFailedText(getContext()), this.f.getHelpText(getContext()));
            this.a.setActionRetry(new View.OnClickListener() { // from class: u91
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.p(view);
                }
            });
            this.a.setOnClickListener(new View.OnClickListener() { // from class: w91
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.q(view);
                }
            });
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        initViewModel();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.a = new TipComponent(getActivity());
        t(false);
        return this.a;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        stopLoading();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (this.f == null) {
            throw new IllegalStateException("Missing called setStringProvider()");
        }
        this.d.refresh();
        s();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        B();
    }

    public void setEnableChangeListener(EnableChangeListener enableChangeListener) {
        this.b = enableChangeListener;
    }

    public void setNavigator(DeviceStatusNavigator deviceStatusNavigator) {
        this.e = deviceStatusNavigator;
    }

    public void setStringProvider(DeviceStatusStringProvider deviceStatusStringProvider) {
        this.f = deviceStatusStringProvider;
    }
}
