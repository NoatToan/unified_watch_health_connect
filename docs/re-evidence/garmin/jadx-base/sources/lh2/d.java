package lh2;

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
import ch.qos.logback.classic.Logger;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.garmin.android.apps.connectmobile.R;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import i3.e5;
import java.util.Objects;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Llh2/d;", "Landroidx/fragment/app/Fragment;", "", "callingApp", "<init>", "(Ljava/lang/String;)V", "c", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d extends Fragment {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c f112457i = new c(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f112458j = "DeviceLinkBanner";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f112459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ii2.a f112460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f112461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k32.n f112462d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CompanionDeviceManager f112463e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CompanionDeviceManager.Callback f112464f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final hi2.d f112465g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f112466h;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"lh2/d$a", "Landroid/companion/CompanionDeviceManager$Callback;", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends CompanionDeviceManager.Callback {
        public a() {
        }

        @Override // android.companion.CompanionDeviceManager.Callback
        public final void onAssociationPending(IntentSender intentSender) {
            intentSender.getClass();
            d dVar = d.this;
            dVar.f112465g.getClass();
            d.u6(dVar, intentSender);
        }

        @Override // android.companion.CompanionDeviceManager.Callback
        public final void onFailure(CharSequence charSequence) {
            d dVar = d.this;
            dVar.f112461c.removeCallbacksAndMessages(null);
            hi2.d dVar2 = dVar.f112465g;
            Objects.toString(charSequence);
            Logger logger = hi2.d.f83889c;
            dVar2.getClass();
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"lh2/d$b", "Landroid/companion/CompanionDeviceManager$Callback;", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b extends CompanionDeviceManager.Callback {
        public b() {
        }

        @Override // android.companion.CompanionDeviceManager.Callback
        @o13.e
        public final void onDeviceFound(IntentSender intentSender) {
            intentSender.getClass();
            d dVar = d.this;
            dVar.f112465g.getClass();
            d.u6(dVar, intentSender);
        }

        @Override // android.companion.CompanionDeviceManager.Callback
        public final void onFailure(CharSequence charSequence) {
            d dVar = d.this;
            dVar.f112461c.removeCallbacksAndMessages(null);
            hi2.d dVar2 = dVar.f112465g;
            Objects.toString(charSequence);
            Logger logger = hi2.d.f83889c;
            dVar2.getClass();
        }
    }

    /* JADX INFO: renamed from: lh2.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"lh2/d$d", "Landroid/text/style/ClickableSpan;", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class C2159d extends ClickableSpan {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f112469a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f112470b;

        public C2159d(View view2, d dVar) {
            this.f112469a = view2;
            this.f112470b = dVar;
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View view2) {
            view2.getClass();
            hi2.f.f83903a.getClass();
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            boolean zIsEnabled = defaultAdapter != null ? defaultAdapter.isEnabled() : false;
            d dVar = this.f112470b;
            if (!zIsEnabled) {
                dVar.startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), 456);
            } else {
                c cVar = d.f112457i;
                dVar.v6();
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public final void updateDrawState(TextPaint textPaint) {
            textPaint.getClass();
            textPaint.setColor(a7.b.getColor(((TextView) this.f112469a).getContext(), R.color.action_text));
            textPaint.setUnderlineText(false);
        }
    }

    public d(String str) {
        str.getClass();
        this.f112459a = str;
        this.f112461c = new Handler(Looper.getMainLooper());
        this.f112462d = new k32.n(this, 8);
        this.f112465g = new hi2.d("DeviceLinkBanner", null, 2, null);
        this.f112464f = Build.VERSION.SDK_INT >= 33 ? new a() : new b();
    }

    public static final void u6(d dVar, IntentSender intentSender) {
        d dVar2;
        dVar.f112461c.removeCallbacksAndMessages(null);
        try {
            dVar2 = dVar;
            try {
                dVar2.startIntentSenderForResult(intentSender, 123, null, 0, 0, 0, new Bundle());
            } catch (IntentSender.SendIntentException e4) {
                e = e4;
                IntentSender.SendIntentException sendIntentException = e;
                hi2.d dVar3 = dVar2.f112465g;
                sendIntentException.getMessage();
                Logger logger = hi2.d.f83889c;
                dVar3.getClass();
            }
        } catch (IntentSender.SendIntentException e14) {
            e = e14;
            dVar2 = dVar;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i14, int i15, Intent intent) {
        if (i14 == 123) {
            ii2.a aVar = this.f112460b;
            if (aVar != null) {
                aVar.f93790a.m(Boolean.valueOf(i15 == -1));
                return;
            } else {
                p005kotlin.jvm.internal.s.m(ModelSourceWrapper.TYPE);
                throw null;
            }
        }
        if (i14 != 456) {
            return;
        }
        hi2.f.f83903a.getClass();
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null ? defaultAdapter.isEnabled() : false) {
            v6();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f112466h = arguments.getString("arg_mac_address");
        }
        Context context = getContext();
        this.f112463e = context != null ? (CompanionDeviceManager) context.getSystemService(CompanionDeviceManager.class) : null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        TextView textView = new TextView(getContext());
        textView.setBackgroundResource(R.color.surface_2);
        textView.setTextSize(0, getResources().getDimension(R.dimen.andfont_body_2));
        Context context = getContext();
        textView.setTextColor(context != null ? a7.b.getColor(context, R.color.secondary_text) : -1);
        int dimension = (int) getResources().getDimension(R.dimen.standard_small_margin);
        textView.setPadding(dimension, dimension, dimension, dimension);
        this.f112465g.getClass();
        return textView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        androidx.fragment.app.m mVarRequireActivity = requireActivity();
        mVarRequireActivity.getClass();
        this.f112460b = (ii2.a) new x1(mVarRequireActivity).a(ii2.a.class);
        TextView textView = (TextView) view2;
        String string = getString(R.string.link_my_device);
        string.getClass();
        SpannableString spannableString = new SpannableString(e5.g(getString(R.string.companion_device_linked_permission_msg, this.f112459a), StringUtils.SPACE, string));
        spannableString.setSpan(new C2159d(view2, this), spannableString.length() - string.length(), spannableString.length(), 33);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(spannableString);
    }

    public final void v6() {
        String str = this.f112466h;
        if (str != null) {
            BluetoothDeviceFilter bluetoothDeviceFilterBuild = new BluetoothDeviceFilter.Builder().setAddress(str).build();
            bluetoothDeviceFilterBuild.getClass();
            AssociationRequest.Builder singleDevice = new AssociationRequest.Builder().addDeviceFilter(bluetoothDeviceFilterBuild).setSingleDevice(true);
            singleDevice.getClass();
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 31) {
                zh2.e.f204807a.getClass();
                if (zh2.e.f204813g) {
                    singleDevice.setDeviceProfile("android.app.role.COMPANION_DEVICE_WATCH");
                }
            }
            this.f112465g.getClass();
            this.f112461c.postDelayed(this.f112462d, AbstractComponentTracker.LINGERING_TIMEOUT);
            CompanionDeviceManager companionDeviceManager = this.f112463e;
            CompanionDeviceManager.Callback callback = this.f112464f;
            if (i14 < 33) {
                if (companionDeviceManager != null) {
                    AssociationRequest associationRequestBuild = singleDevice.build();
                    if (callback != null) {
                        companionDeviceManager.associate(associationRequestBuild, callback, (Handler) null);
                        return;
                    } else {
                        p005kotlin.jvm.internal.s.m("companionDeviceCallback");
                        throw null;
                    }
                }
                return;
            }
            bv2.g gVar = new bv2.g(2);
            if (companionDeviceManager != null) {
                AssociationRequest associationRequestBuild2 = singleDevice.build();
                if (callback != null) {
                    companionDeviceManager.associate(associationRequestBuild2, gVar, callback);
                } else {
                    p005kotlin.jvm.internal.s.m("companionDeviceCallback");
                    throw null;
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Llh2/d$c;", "", "<init>", "()V", "", "ARG_MAC_ADDRESS", "Ljava/lang/String;", "", "REQUEST_CODE_COMPANION_DEVICE", "I", "REQUEST_CODE_ENABLE_BT", "", "SCAN_TIMEOUT", "J", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private c() {
        }
    }
}
