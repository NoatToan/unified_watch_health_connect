package androidx.camera.core.impl;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class a3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f5492a = new LinkedHashMap();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l2 f5493a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b3<?> f5494b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final q2 f5495c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<c3.b> f5496d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f5497e = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f5498f = false;

        public a(l2 l2Var, b3<?> b3Var, q2 q2Var, List<c3.b> list) {
            this.f5493a = l2Var;
            this.f5494b = b3Var;
            this.f5495c = q2Var;
            this.f5496d = list;
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("UseCaseAttachInfo{mSessionConfig=");
            sb3.append(this.f5493a);
            sb3.append(", mUseCaseConfig=");
            sb3.append(this.f5494b);
            sb3.append(", mStreamSpec=");
            sb3.append(this.f5495c);
            sb3.append(", mCaptureTypes=");
            sb3.append(this.f5496d);
            sb3.append(", mAttached=");
            sb3.append(this.f5497e);
            sb3.append(", mActive=");
            return am.j.t(sb3, this.f5498f, CoreConstants.CURLY_RIGHT);
        }
    }

    public a3(String str) {
    }

    public final l2.h a() {
        l2.h hVar = new l2.h();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f5492a.entrySet()) {
            a aVar = (a) entry.getValue();
            if (aVar.f5498f && aVar.f5497e) {
                String str = (String) entry.getKey();
                hVar.a(aVar.f5493a);
                arrayList.add(str);
            }
        }
        arrayList.toString();
        return hVar;
    }

    public final l2.h b() {
        l2.h hVar = new l2.h();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f5492a.entrySet()) {
            a aVar = (a) entry.getValue();
            if (aVar.f5497e) {
                hVar.a(aVar.f5493a);
                arrayList.add((String) entry.getKey());
            }
        }
        arrayList.toString();
        return hVar;
    }

    public final Collection<l2> c() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f5492a.entrySet()) {
            if (((a) entry.getValue()).f5497e) {
                arrayList.add(((a) entry.getValue()).f5493a);
            }
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    public final Collection<b3<?>> d() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f5492a.entrySet()) {
            if (((a) entry.getValue()).f5497e) {
                arrayList.add(((a) entry.getValue()).f5494b);
            }
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    public final boolean e(String str) {
        LinkedHashMap linkedHashMap = this.f5492a;
        if (linkedHashMap.containsKey(str)) {
            return ((a) linkedHashMap.get(str)).f5497e;
        }
        return false;
    }

    public final void f(String str, l2 l2Var, b3<?> b3Var, q2 q2Var, List<c3.b> list) {
        LinkedHashMap linkedHashMap = this.f5492a;
        if (linkedHashMap.containsKey(str)) {
            a aVar = new a(l2Var, b3Var, q2Var, list);
            a aVar2 = (a) linkedHashMap.get(str);
            aVar.f5497e = aVar2.f5497e;
            aVar.f5498f = aVar2.f5498f;
            linkedHashMap.put(str, aVar);
        }
    }
}
