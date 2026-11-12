package com.huawei.hwcommonmodel;

import com.huawei.hwlogsmodel.LogUtil;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public class TrackSimilarityIdentifier {

    public enum TrackRouteDateInfo {
        VALID_DATE,
        INVALID_DATE
    }

    private static void b(String str, List<TrackRecord> list) {
        LogUtil.d("TrackSimilarityIdentifier", str, " duplicatesEliminate records, records size:", Integer.valueOf(list.size()), " records print start");
        for (int i = 0; i < list.size(); i++) {
            TrackRecord trackRecord = list.get(i);
            LogUtil.d("TrackSimilarityIdentifier", str, " duplicatesEliminate[", Integer.valueOf(i), "]:", c(trackRecord.getStartTime()), " - ", c(trackRecord.getEndTime()), " duration:", Long.valueOf(trackRecord.getDuration()), " distance:", Float.valueOf(trackRecord.getDistance()), " isWatchData:", Boolean.valueOf(trackRecord.isWatchData()));
        }
        LogUtil.d("TrackSimilarityIdentifier", str, " duplicatesEliminate records, records size:", Integer.valueOf(list.size()), " records print end");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(String str, TrackRecord trackRecord) {
        if (trackRecord == null) {
            LogUtil.d("TrackSimilarityIdentifier", str, " TrackRecord :TrackRecord = null ");
            return;
        }
        LogUtil.d("TrackSimilarityIdentifier", str, " TrackRecord :", c(trackRecord.getStartTime()), " - ", c(trackRecord.getEndTime()), " duration:", Long.valueOf(trackRecord.getDuration()), " distance:", Float.valueOf(trackRecord.getDistance()), " isWatchData:", Boolean.valueOf(trackRecord.isWatchData()));
    }

    private static String c(long j) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(j));
    }

    private List<TrackRecord> c(List<TrackRecord> list) {
        boolean z;
        b("Arg:", list);
        d dVar = new d();
        dVar.a(list);
        d.b bVarA = dVar.a();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (bVarA.c()) {
            TrackRecord trackRecordD = bVarA.d();
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                if (dVar.b(trackRecordD, (TrackRecord) it.next())) {
                    z = true;
                    break;
                }
            }
            if (!z) {
                arrayList.add(trackRecordD);
            }
            a("ranking(isConflictWithResult:" + z + "):" + i, trackRecordD);
            i++;
        }
        Collections.sort(arrayList, new Comparator<TrackRecord>() { // from class: com.huawei.hwcommonmodel.TrackSimilarityIdentifier.1
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(TrackRecord trackRecord, TrackRecord trackRecord2) {
                return trackRecord.getStartTime() >= trackRecord2.getStartTime() ? 1 : -1;
            }
        });
        b("result:", arrayList);
        return arrayList;
    }

    public List<TrackRecord> d(List<TrackRecord> list, TrackRouteDateInfo trackRouteDateInfo) {
        if (list == null) {
            return null;
        }
        if (trackRouteDateInfo == TrackRouteDateInfo.VALID_DATE) {
            return c(list);
        }
        if (trackRouteDateInfo != TrackRouteDateInfo.INVALID_DATE) {
            return null;
        }
        List<TrackRecord> listC = c(list);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        arrayList.removeAll(listC);
        return arrayList;
    }

    static class d {
        private List<TrackRecord> d;

        private d() {
            this.d = new ArrayList();
        }

        public void a(List<TrackRecord> list) {
            this.d = list;
        }

        public b a() {
            return new b();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean b(TrackRecord trackRecord, TrackRecord trackRecord2) {
            return e(trackRecord, trackRecord2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean e(TrackRecord trackRecord, TrackRecord trackRecord2) {
            return (trackRecord.getDuration() + trackRecord2.getDuration()) - (Math.max(trackRecord.getEndTime(), trackRecord2.getEndTime()) - Math.min(trackRecord.getStartTime(), trackRecord2.getStartTime())) > 300000;
        }

        public class b {
            private Iterator<TrackRecord> e;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private List<TrackRecord> f17211a = new ArrayList();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private List<TrackRecord> f17213c = new ArrayList();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private List<TrackRecord> f17212b = new ArrayList();

            b() {
                C0180b c0180b;
                final HashMap map = new HashMap();
                for (e eVar : e(d.this.d)) {
                    eVar.c();
                    for (Map.Entry entry : eVar.a()) {
                        if (!map.containsKey(entry.getKey())) {
                            c0180b = new C0180b(0.0f);
                        } else {
                            c0180b = (C0180b) map.get(entry.getKey());
                        }
                        c0180b.c(((Float) entry.getValue()).floatValue());
                        map.put((TrackRecord) entry.getKey(), c0180b);
                    }
                }
                Iterator it = map.entrySet().iterator();
                while (it.hasNext()) {
                    this.f17211a.add((TrackRecord) ((Map.Entry) it.next()).getKey());
                }
                Collections.sort(this.f17211a, new Comparator<TrackRecord>() { // from class: com.huawei.hwcommonmodel.TrackSimilarityIdentifier.d.b.3
                    @Override // java.util.Comparator
                    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                    public int compare(TrackRecord trackRecord, TrackRecord trackRecord2) {
                        if (!map.containsKey(trackRecord) || !map.containsKey(trackRecord2)) {
                            throw new UnsupportedOperationException("sort records not in marker List,logical error!!!");
                        }
                        return Float.compare(((C0180b) map.get(trackRecord)).e(), ((C0180b) map.get(trackRecord2)).e());
                    }
                });
                for (TrackRecord trackRecord : d.this.d) {
                    if (!this.f17211a.contains(trackRecord)) {
                        this.f17213c.add(trackRecord);
                    }
                }
                this.f17212b.addAll(this.f17211a);
                this.f17212b.addAll(this.f17213c);
                Collections.reverse(this.f17212b);
                this.e = this.f17212b.iterator();
            }

            public boolean c() {
                return this.e.hasNext();
            }

            public TrackRecord d() {
                return this.e.next();
            }

            private List<e> e(List<TrackRecord> list) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < list.size(); i++) {
                    e eVarA = a(i, list);
                    if (eVarA != null) {
                        arrayList.add(eVarA);
                    }
                }
                return arrayList;
            }

            private e a(int i, List<TrackRecord> list) {
                TrackRecord trackRecord = list.get(i);
                e eVar = null;
                for (int i2 = 0; i2 < list.size(); i2++) {
                    if (i != i2 && d.this.e(trackRecord, list.get(i2))) {
                        if (eVar == null) {
                            eVar = new e();
                            eVar.a(trackRecord);
                        }
                        eVar.a(list.get(i2));
                    }
                }
                return eVar;
            }

            class e {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private List<TrackRecord> f17217a;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private float f17219c;
                private Map<TrackRecord, Float> d;
                private float e;

                private e() {
                    this.f17217a = new ArrayList();
                    this.d = new HashMap();
                    this.e = 0.0f;
                    this.f17219c = 0.0f;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public Set<Map.Entry<TrackRecord, Float>> a() {
                    return this.d.entrySet();
                }

                public void c() {
                    TrackRecord trackRecord = this.f17217a.size() > 0 ? this.f17217a.get(0) : null;
                    Collections.sort(this.f17217a, new Comparator<TrackRecord>() { // from class: com.huawei.hwcommonmodel.TrackSimilarityIdentifier.d.b.e.3
                        @Override // java.util.Comparator
                        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                        public int compare(TrackRecord trackRecord2, TrackRecord trackRecord3) {
                            if (Float.compare(trackRecord2.getDistance(), trackRecord3.getDistance()) != 0) {
                                return Float.compare(trackRecord2.getDistance(), trackRecord3.getDistance());
                            }
                            if (trackRecord2.getStartTime() < trackRecord3.getStartTime()) {
                                return 1;
                            }
                            return trackRecord2.getStartTime() > trackRecord3.getStartTime() ? -1 : 0;
                        }
                    });
                    if (this.f17217a.size() == 0 || this.f17217a.size() == 1) {
                        return;
                    }
                    this.d.clear();
                    float size = 2.0f / (this.f17217a.size() - 1.0f);
                    LogUtil.d("TrackSimilarityIdentifier", "make score begin,size:", Integer.valueOf(this.f17217a.size()));
                    TrackSimilarityIdentifier.a("make score begin,base:", trackRecord);
                    this.d.put(this.f17217a.get(0), Float.valueOf(1.0f));
                    TrackSimilarityIdentifier.a("make score[" + this.d.get(this.f17217a.get(0)) + "]:", this.f17217a.get(0));
                    for (int i = 1; i < this.f17217a.size() - 1; i++) {
                        this.d.put(this.f17217a.get(i), Float.valueOf((i * size) + 1.0f));
                        TrackSimilarityIdentifier.a("make score[" + this.d.get(this.f17217a.get(i)) + "]:", this.f17217a.get(i));
                    }
                    Map<TrackRecord, Float> map = this.d;
                    List<TrackRecord> list = this.f17217a;
                    map.put(list.get(list.size() - 1), Float.valueOf(3.0f));
                    StringBuilder sb = new StringBuilder("make score[");
                    Map<TrackRecord, Float> map2 = this.d;
                    List<TrackRecord> list2 = this.f17217a;
                    sb.append(map2.get(list2.get(list2.size() - 1)));
                    sb.append("]:");
                    String string = sb.toString();
                    List<TrackRecord> list3 = this.f17217a;
                    TrackSimilarityIdentifier.a(string, list3.get(list3.size() - 1));
                    LogUtil.d("TrackSimilarityIdentifier", "make score end,size:", Integer.valueOf(this.f17217a.size()));
                }

                public void a(TrackRecord trackRecord) {
                    this.f17217a.add(trackRecord);
                    float distance = trackRecord.getDistance();
                    if (distance > this.e) {
                        this.e = distance;
                    }
                    if (!trackRecord.isWatchData() || distance <= this.f17219c) {
                        return;
                    }
                    this.f17219c = distance;
                }
            }

            /* JADX INFO: renamed from: com.huawei.hwcommonmodel.TrackSimilarityIdentifier$d$b$b, reason: collision with other inner class name */
            class C0180b {
                private int d = 0;
                private float e;

                C0180b(float f) {
                    this.e = f;
                }

                public void c(float f) {
                    this.d++;
                    this.e += f;
                }

                public float e() {
                    int i = this.d;
                    if (i == 0) {
                        return 0.0f;
                    }
                    return this.e / i;
                }
            }
        }
    }

    public static abstract class TrackRecord {
        public abstract float getDistance();

        public abstract long getEndTime();

        public abstract long getStartTime();

        public abstract boolean isWatchData();

        public long getDuration() {
            return getEndTime() - getStartTime();
        }
    }
}
