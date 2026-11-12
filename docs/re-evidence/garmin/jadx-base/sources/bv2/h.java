package bv2;

import android.bluetooth.BluetoothAdapter;
import android.companion.AssociationRequest;
import android.companion.BluetoothDeviceFilter;
import android.companion.CompanionDeviceManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.x1;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.garmin.android.apps.connectmobile.R;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import i3.e5;
import java.util.Objects;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lbv2/h;", "Landroidx/fragment/app/Fragment;", "", "callingApp", "<init>", "(Ljava/lang/String;)V", "c", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h extends Fragment {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final c f21485k = new c(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f21486l = "DeviceLinkBanner";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public dx2.b f21488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f21489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a0.c f21490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CompanionDeviceManager f21491e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CompanionDeviceManager.Callback f21492f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final cx2.h f21493g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f21494h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final f.c<f.i> f21495i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f.c<Intent> f21496j;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"bv2/h$a", "Landroid/companion/CompanionDeviceManager$Callback;", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a extends CompanionDeviceManager.Callback {
        public a() {
        }

        @Override // android.companion.CompanionDeviceManager.Callback
        public final void onAssociationPending(IntentSender intentSender) {
            intentSender.getClass();
            h hVar = h.this;
            hVar.f21493g.getClass();
            h.u6(hVar, intentSender);
        }

        @Override // android.companion.CompanionDeviceManager.Callback
        public final void onFailure(CharSequence charSequence) {
            h hVar = h.this;
            hVar.f21489c.removeCallbacksAndMessages(null);
            cx2.h hVar2 = hVar.f21493g;
            Objects.toString(charSequence);
            Logger logger = cx2.h.f56678c;
            hVar2.getClass();
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"bv2/h$b", "Landroid/companion/CompanionDeviceManager$Callback;", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b extends CompanionDeviceManager.Callback {
        public b() {
        }

        @Override // android.companion.CompanionDeviceManager.Callback
        @o13.e
        public final void onDeviceFound(IntentSender intentSender) {
            intentSender.getClass();
            h hVar = h.this;
            hVar.f21493g.getClass();
            h.u6(hVar, intentSender);
        }

        @Override // android.companion.CompanionDeviceManager.Callback
        public final void onFailure(CharSequence charSequence) {
            h hVar = h.this;
            hVar.f21489c.removeCallbacksAndMessages(null);
            cx2.h hVar2 = hVar.f21493g;
            Objects.toString(charSequence);
            Logger logger = cx2.h.f56678c;
            hVar2.getClass();
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"bv2/h$d", "Landroid/text/style/ClickableSpan;", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d extends ClickableSpan {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f21499a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h f21500b;

        public d(View view2, h hVar) {
            this.f21499a = view2;
            this.f21500b = hVar;
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View view2) {
            view2.getClass();
            cx2.i.f56681a.getClass();
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            boolean zIsEnabled = defaultAdapter != null ? defaultAdapter.isEnabled() : false;
            h hVar = this.f21500b;
            if (!zIsEnabled) {
                hVar.f21496j.a(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), null);
            } else {
                c cVar = h.f21485k;
                hVar.v6();
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public final void updateDrawState(TextPaint textPaint) {
            textPaint.getClass();
            textPaint.setColor(a7.b.getColor(((TextView) this.f21499a).getContext(), R.color.action_text));
            textPaint.setUnderlineText(false);
        }
    }

    public h(String str) {
        str.getClass();
        this.f21487a = str;
        this.f21489c = new Handler(Looper.getMainLooper());
        this.f21490d = new a0.c(this, 24);
        this.f21493g = new cx2.h("DeviceLinkBanner", null, 2, null);
        this.f21492f = Build.VERSION.SDK_INT >= 33 ? new a() : new b();
        final int i14 = 0;
        f.c<f.i> cVarRegisterForActivityResult = registerForActivityResult(new g.i(), new f.b(this) { // from class: bv2.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f21483b;

            {
                this.f21483b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                int i15 = i14;
                h hVar = this.f21483b;
                f.a aVar = (f.a) obj;
                switch (i15) {
                    case 0:
                        h.c cVar = h.f21485k;
                        aVar.getClass();
                        dx2.b bVar = hVar.f21488b;
                        if (bVar != null) {
                            bVar.f61483a.m(Boolean.valueOf(aVar.f67585a == -1));
                            return;
                        } else {
                            s.m(ModelSourceWrapper.TYPE);
                            throw null;
                        }
                    default:
                        h.c cVar2 = h.f21485k;
                        aVar.getClass();
                        cx2.i.f56681a.getClass();
                        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
                        if (defaultAdapter != null ? defaultAdapter.isEnabled() : false) {
                            hVar.v6();
                            return;
                        }
                        return;
                }
            }
        });
        cVarRegisterForActivityResult.getClass();
        this.f21495i = cVarRegisterForActivityResult;
        final int i15 = 1;
        f.c<Intent> cVarRegisterForActivityResult2 = registerForActivityResult(new g.h(), new f.b(this) { // from class: bv2.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f21483b;

            {
                this.f21483b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                int i16 = i15;
                h hVar = this.f21483b;
                f.a aVar = (f.a) obj;
                switch (i16) {
                    case 0:
                        h.c cVar = h.f21485k;
                        aVar.getClass();
                        dx2.b bVar = hVar.f21488b;
                        if (bVar != null) {
                            bVar.f61483a.m(Boolean.valueOf(aVar.f67585a == -1));
                            return;
                        } else {
                            s.m(ModelSourceWrapper.TYPE);
                            throw null;
                        }
                    default:
                        h.c cVar2 = h.f21485k;
                        aVar.getClass();
                        cx2.i.f56681a.getClass();
                        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
                        if (defaultAdapter != null ? defaultAdapter.isEnabled() : false) {
                            hVar.v6();
                            return;
                        }
                        return;
                }
            }
        });
        cVarRegisterForActivityResult2.getClass();
        this.f21496j = cVarRegisterForActivityResult2;
    }

    public static final void u6(h hVar, IntentSender intentSender) {
        hVar.f21489c.removeCallbacksAndMessages(null);
        try {
            hVar.f21495i.a(new f.i.a(intentSender).a(), null);
        } catch (IntentSender.SendIntentException e4) {
            cx2.h hVar2 = hVar.f21493g;
            e4.getMessage();
            Logger logger = cx2.h.f56678c;
            hVar2.getClass();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f21494h = arguments.getString("arg_mac_address");
        }
        Context context = getContext();
        this.f21491e = context != null ? (CompanionDeviceManager) context.getSystemService(CompanionDeviceManager.class) : null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        TextView textView = new TextView(getContext());
        textView.setBackgroundResource(R.color.surface_2);
        textView.setTextSize(0, getResources().getDimension(R.dimen.andfont_body_2));
        Context context = getContext();
        textView.setTextColor(context != null ? a7.b.getColor(context, R.color.secondary_text) : -1);
        int dimension = (int) getResources().getDimension(R.dimen.rts_standard_small_margin);
        textView.setPadding(dimension, dimension, dimension, dimension);
        this.f21493g.getClass();
        return textView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        androidx.fragment.app.m mVarRequireActivity = requireActivity();
        mVarRequireActivity.getClass();
        this.f21488b = (dx2.b) new x1(mVarRequireActivity).a(dx2.b.class);
        TextView textView = (TextView) view2;
        String string = getString(R.string.link_my_device);
        string.getClass();
        SpannableString spannableString = new SpannableString(e5.g(getString(R.string.companion_device_linked_permission_msg, this.f21487a), StringUtils.SPACE, string));
        spannableString.setSpan(new d(view2, this), spannableString.length() - string.length(), spannableString.length(), 33);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(spannableString);
    }

    public final void v6() {
        String str = this.f21494h;
        if (str != null) {
            BluetoothDeviceFilter bluetoothDeviceFilterBuild = new BluetoothDeviceFilter.Builder().setAddress(str).build();
            bluetoothDeviceFilterBuild.getClass();
            AssociationRequest.Builder singleDevice = new AssociationRequest.Builder().addDeviceFilter(bluetoothDeviceFilterBuild).setSingleDevice(true);
            singleDevice.getClass();
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 31) {
                com.garmin.realtimesettings.app.initialization.b.f52589a.getClass();
                if (com.garmin.realtimesettings.app.initialization.b.f52597i) {
                    singleDevice.setDeviceProfile("android.app.role.COMPANION_DEVICE_WATCH");
                }
            }
            this.f21493g.getClass();
            this.f21489c.postDelayed(this.f21490d, AbstractComponentTracker.LINGERING_TIMEOUT);
            CompanionDeviceManager companionDeviceManager = this.f21491e;
            CompanionDeviceManager.Callback callback = this.f21492f;
            if (i14 < 33) {
                if (companionDeviceManager != null) {
                    AssociationRequest associationRequestBuild = singleDevice.build();
                    if (callback != null) {
                        companionDeviceManager.associate(associationRequestBuild, callback, (Handler) null);
                        return;
                    } else {
                        s.m("companionDeviceCallback");
                        throw null;
                    }
                }
                return;
            }
            g gVar = new g(0);
            if (companionDeviceManager != null) {
                AssociationRequest associationRequestBuild2 = singleDevice.build();
                if (callback != null) {
                    companionDeviceManager.associate(associationRequestBuild2, gVar, callback);
                } else {
                    s.m("companionDeviceCallback");
                    throw null;
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lbv2/h$c;", "", "<init>", "()V", "", "ARG_MAC_ADDRESS", "Ljava/lang/String;", "", "REQUEST_CODE_COMPANION_DEVICE", "I", "REQUEST_CODE_ENABLE_BT", "", "SCAN_TIMEOUT", "J", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private c() {
        }
    }
}
