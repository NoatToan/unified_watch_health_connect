package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.transition.c;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.uimanager.UIManagerModule;

/* JADX INFO: loaded from: classes6.dex */
public class yzp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UIManagerModule f40730a;

    public class a implements p7q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f40731a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ReadableMap f40732b;

        public a(int i, ReadableMap readableMap) {
            this.f40731a = i;
            this.f40732b = readableMap;
        }

        @Override // defpackage.p7q
        public void execute(zhg zhgVar) {
            try {
                View viewX = zhgVar.x(this.f40731a);
                if (viewX instanceof ViewGroup) {
                    ReadableArray array = this.f40732b.getArray("transitions");
                    int size = array.size();
                    for (int i = 0; i < size; i++) {
                        c.b((ViewGroup) viewX, c0q.c(array.getMap(i)));
                    }
                }
            } catch (IllegalViewOperationException unused) {
            }
        }
    }

    public yzp(UIManagerModule uIManagerModule) {
        this.f40730a = uIManagerModule;
    }

    public void a(int i, ReadableMap readableMap) {
        this.f40730a.prependUIBlock(new a(i, readableMap));
    }
}
