package com.google.android.exoplayer2.source.rtsp;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import defpackage.fk1;
import defpackage.wlq;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImmutableList<String> f8224a;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<String> f8225a = new ArrayList();

        public b b(String str, String str2) {
            this.f8225a.add(str.trim());
            this.f8225a.add(str2.trim());
            return this;
        }

        public b c(List<String> list) {
            for (int i = 0; i < list.size(); i++) {
                String[] strArrN0 = wlq.N0(list.get(i), ":\\s?");
                if (strArrN0.length == 2) {
                    b(strArrN0[0], strArrN0[1]);
                }
            }
            return this;
        }

        public b d(Map<String, String> map) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                b(entry.getKey(), entry.getValue());
            }
            return this;
        }

        public d e() {
            return new d(this);
        }
    }

    public ImmutableMap<String, String> a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i = 0; i < this.f8224a.size(); i += 2) {
            linkedHashMap.put(this.f8224a.get(i), this.f8224a.get(i + 1));
        }
        return ImmutableMap.copyOf((Map) linkedHashMap);
    }

    public String b(String str) {
        for (int size = this.f8224a.size() - 2; size >= 0; size -= 2) {
            if (fk1.a(str, this.f8224a.get(size))) {
                return this.f8224a.get(size + 1);
            }
        }
        return null;
    }

    public d(b bVar) {
        this.f8224a = ImmutableList.copyOf((Collection) bVar.f8225a);
    }
}
