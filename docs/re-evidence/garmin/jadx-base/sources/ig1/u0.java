package ig1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import java.util.ArrayList;
import java.util.HashMap;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lig1/u0;", "Lig1/g0;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class u0 extends g0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f93414j = 0;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(Context context) {
        super(context);
        context.getClass();
    }

    @Override // fb2.e
    public final boolean h(com.garmin.android.apps.connectmobile.devices.model.f fVar) {
        com.garmin.android.apps.connectmobile.devices.model.f fVar2 = fVar;
        fVar2.getClass();
        return fVar2.f34132b.containsKey("cadenceAlertCustomHighValue");
    }

    @Override // fb2.e
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final boolean g(i.c cVar, com.garmin.android.apps.connectmobile.devices.model.f fVar) {
        cVar.getClass();
        fVar.getClass();
        Object systemService = cVar.getSystemService("layout_inflater");
        systemService.getClass();
        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.gcm3_activity_options_expandable_field, (ViewGroup) null);
        this.f93321d = viewInflate;
        View viewFindViewById = viewInflate.findViewById(R.id.expansionBtn);
        viewFindViewById.getClass();
        this.f93322e = (GCMComplexOneLineButton) viewFindViewById;
        View viewFindViewById2 = this.f93321d.findViewById(R.id.expandableDetails);
        viewFindViewById2.getClass();
        this.f93323f = (LinearLayout) viewFindViewById2;
        View viewFindViewById3 = this.f93321d.findViewById(R.id.firstDetailBtn);
        viewFindViewById3.getClass();
        this.f93324g = (GCMComplexOneLineButton) viewFindViewById3;
        this.f93322e.setOnCheckedChangeListener(new bl0.b(4, this, fVar));
        ArrayList arrayList = new ArrayList();
        for (int i14 = 20; i14 <= 120; i14 += 5) {
            arrayList.add(String.valueOf(i14));
        }
        this.f93324g.setOnClickListener(new bv2.j(this, 8, (String[]) arrayList.toArray(new String[0]), fVar));
        return k(fVar);
    }

    @Override // fb2.e
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final boolean k(com.garmin.android.apps.connectmobile.devices.model.f fVar) {
        fVar.getClass();
        HashMap<String, Object> map = fVar.f34132b;
        boolean zContainsKey = map.containsKey("cadenceAlertCustomHighValue");
        if (zContainsKey) {
            this.f93322e.setButtonLeftLabel(this.f70343a.getString(R.string.lbl_high_stroke_rate));
            Object obj = map.get("cadenceAlertModeHighEnabled");
            obj.getClass();
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            GCMComplexOneLineButton gCMComplexOneLineButton = this.f93322e;
            if (zBooleanValue) {
                gCMComplexOneLineButton.k();
                this.f93323f.setVisibility(0);
            } else {
                gCMComplexOneLineButton.j();
                this.f93323f.setVisibility(8);
            }
            this.f93324g.setButtonLeftLabel(this.f70343a.getString(R.string.lbl_strokes_per_minute));
            GCMComplexOneLineButton gCMComplexOneLineButton2 = this.f93324g;
            Object obj2 = map.get("cadenceAlertCustomHighValue");
            gCMComplexOneLineButton2.setButtonRightLabel(String.valueOf(obj2 instanceof Integer ? (Integer) obj2 : null));
            this.f93324g.setVisibility(0);
        }
        return zContainsKey;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lig1/u0$a;", "", "<init>", "()V", "", "NUMBER_OF_PICKERS", "I", "MIN_VALUE_FOR_STROKES_RATE", "MAX_VALUE_FOR_STROKES_RATE", "INCREMENT_STEP_FOR_STROKE_RATE", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
