package defpackage;

import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.devsupport.JSCHeapCapture;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public class kr5 extends oee {

    public class a implements Provider<NativeModule> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ReactApplicationContext f24207a;

        public a(ReactApplicationContext reactApplicationContext) {
            this.f24207a = reactApplicationContext;
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new JSCHeapCapture(this.f24207a);
        }
    }

    @Override // defpackage.oee
    public List<ModuleSpec> b(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ModuleSpec.nativeModuleSpec((Class<? extends NativeModule>) JSCHeapCapture.class, new a(reactApplicationContext)));
        return arrayList;
    }

    @Override // defpackage.oee
    public odj c() {
        return oee.d(this);
    }
}
