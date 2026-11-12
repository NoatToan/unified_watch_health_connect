package v22;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.SeekBar;
import androidx.core.view.g1;
import androidx.core.view.q0;
import androidx.core.view.s0;
import com.garmin.android.apps.connectmobile.R;
import java.util.WeakHashMap;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"v22/b$a", "Landroidx/core/view/a;", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends androidx.core.view.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f175339a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SeekBar f175340b;

        public a(String str, SeekBar seekBar) {
            this.f175339a = str;
            this.f175340b = seekBar;
        }

        @Override // androidx.core.view.a
        public final void sendAccessibilityEvent(View view2, int i14) {
            view2.getClass();
            if (i14 != 32768) {
                super.sendAccessibilityEvent(view2, i14);
                return;
            }
            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i14);
            accessibilityEventObtain.setEventType(16384);
            accessibilityEventObtain.getText().add(this.f175339a);
            SeekBar seekBar = this.f175340b;
            accessibilityEventObtain.setSource(seekBar);
            super.sendAccessibilityEvent(view2, 32768);
            Object systemService = seekBar.getContext().getSystemService("accessibility");
            systemService.getClass();
            AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
            if (accessibilityManager.isEnabled()) {
                accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain);
            }
        }
    }

    public static final void a(String str, SeekBar seekBar) {
        seekBar.getClass();
        str.getClass();
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        new q0(R.id.tag_state_description, CharSequence.class, 64, 30).d(seekBar, "⠀");
        s0.r(seekBar, new a(str, seekBar));
    }
}
