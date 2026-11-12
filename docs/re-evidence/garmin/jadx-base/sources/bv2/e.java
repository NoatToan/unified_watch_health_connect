package bv2;

import a61.d0;
import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.realtimesettings.app.baseviews.views.StyledTextView;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB5\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b\u0007\u0010\u0011¨\u0006\u0012"}, d2 = {"Lbv2/e;", "Lfw2/a;", "Lvw2/b;", "Landroid/content/Context;", "ctx", "Lzw2/b;", "transform", "<init>", "(Landroid/content/Context;Lzw2/b;)V", "Landroidx/fragment/app/Fragment;", "fragment", "Ldx2/c;", "settingsViewModel", "", "", "", "viewAttrs", "(Landroidx/fragment/app/Fragment;Lzw2/b;Ldx2/c;Ljava/util/Map;)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e extends fw2.a implements vw2.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f21474h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zw2.b f21475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AppCompatImageView f21476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StyledTextView f21477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final StyledTextView f21478d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final StyledTextView f21479e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final StyledTextView f21480f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final StyledTextView f21481g;

    /* JADX WARN: Illegal instructions before constructor call */
    public e(Fragment fragment, zw2.b bVar, dx2.c cVar, Map<String, ? extends Object> map) {
        fragment.getClass();
        bVar.getClass();
        cVar.getClass();
        map.getClass();
        Context contextRequireContext = fragment.requireContext();
        contextRequireContext.getClass();
        this(contextRequireContext, bVar);
        bVar.i(this);
        StyledTextView styledTextView = this.f21477c;
        com.garmin.realtimesettings.app.initialization.b.f52589a.getClass();
        styledTextView.setText(com.garmin.realtimesettings.app.initialization.b.c().f192453a.f192451c);
        String str = com.garmin.realtimesettings.app.initialization.b.c().f192453a.f192452d;
        if (str != null) {
            ex2.i iVar = ex2.i.f66970a;
            Context context = getContext();
            context.getClass();
            AppCompatImageView appCompatImageView = this.f21476b;
            iVar.getClass();
            ex2.i.e(context, str, appCompatImageView, 8, null);
        } else {
            this.f21476b.setImageDrawable(a7.b.getDrawable(getContext(), R.drawable.rts_icon_settings_device_default));
        }
        StyledTextView styledTextView2 = this.f21479e;
        String string = bVar.f207282a.getString(R.string.settings_not_available);
        string.getClass();
        styledTextView2.setText(string);
        this.f21481g.setOnClickListener(new d0(19, bVar, this));
    }

    @Override // vw2.b
    public final void a() {
        this.f21475a.j();
    }

    @Override // vw2.b
    public final void b(String str) {
        String string;
        String string2;
        String string3;
        zw2.b bVar = this.f21475a;
        zw2.b.a aVar = bVar.f207275d;
        int[] iArr = zw2.b.C3867b.f207279a;
        int i14 = iArr[aVar.ordinal()];
        Context context = bVar.f207282a;
        if (i14 == 1) {
            string = context.getString(R.string.go_to_settings);
            string.getClass();
        } else {
            string = context.getString(R.string.go_to_support_center);
            string.getClass();
        }
        if (string.length() <= 0) {
            string = null;
        }
        if (string == null) {
            string = "";
        }
        this.f21481g.setText(string);
        if (iArr[bVar.f207275d.ordinal()] == 1) {
            string2 = context.getString(R.string.bluetooth_off_description);
            string2.getClass();
        } else {
            string2 = context.getString(R.string.device_not_connected);
            string2.getClass();
        }
        this.f21478d.setText(string2);
        if (iArr[bVar.f207275d.ordinal()] == 1) {
            string3 = context.getString(R.string.bluetooth_off_description);
            string3.getClass();
        } else {
            com.garmin.realtimesettings.app.initialization.b.f52589a.getClass();
            string3 = context.getString(R.string.device_not_connected_description, com.garmin.realtimesettings.app.initialization.b.c().f192453a.f192451c);
            string3.getClass();
        }
        this.f21480f.setText(string3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, zw2.b bVar) {
        super(context, null, 2, null);
        context.getClass();
        bVar.getClass();
        this.f21475a = bVar;
        new cx2.h("DeviceErrorStatusView", null, 2, null);
        View.inflate(context, R.layout.rts_device_error_status, this);
        View viewFindViewById = findViewById(R.id.device_image);
        viewFindViewById.getClass();
        this.f21476b = (AppCompatImageView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.device_name);
        viewFindViewById2.getClass();
        this.f21477c = (StyledTextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.device_error_status);
        viewFindViewById3.getClass();
        this.f21478d = (StyledTextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.device_error_title);
        viewFindViewById4.getClass();
        this.f21479e = (StyledTextView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.device_error_description);
        viewFindViewById5.getClass();
        this.f21480f = (StyledTextView) viewFindViewById5;
        View viewFindViewById6 = findViewById(R.id.device_error_link);
        viewFindViewById6.getClass();
        this.f21481g = (StyledTextView) viewFindViewById6;
    }
}
