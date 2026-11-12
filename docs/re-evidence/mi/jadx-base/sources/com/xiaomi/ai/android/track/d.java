package com.xiaomi.ai.android.track;

import android.text.TextUtils;
import com.xiaomi.ai.android.capability.TrackCapability;
import com.xiaomi.ai.api.common.APIUtils;
import defpackage.mj1;
import defpackage.nnp;
import defpackage.wpe;
import defpackage.zsd;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class d extends b {
    private nnp i;
    private final mj1 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private com.xiaomi.ai.android.core.e f10976k;
    private int l;

    public d(com.xiaomi.ai.android.core.e eVar, nnp nnpVar, b.d dVar) {
        super(eVar.i().f("track.cache_period_check_interval", 10), eVar.i().f("track.disk_period_check_interval", 1200), true, dVar);
        this.f10976k = eVar;
        this.i = nnpVar;
        this.j = APIUtils.getObjectMapper().createArrayNode();
        this.l = eVar.i().e("track.max_track_data_size");
    }

    private Boolean a(zsd zsdVar) {
        if (zsdVar == null || TextUtils.isEmpty(zsdVar.U())) {
            return Boolean.TRUE;
        }
        wpe.h("InternalTrackStrategy", "sendTrackInfo: ");
        TrackCapability trackCapability = (TrackCapability) this.f10976k.a(TrackCapability.class);
        if (trackCapability != null) {
            return Boolean.valueOf(trackCapability.onEventTrack(zsdVar.U()));
        }
        wpe.e("InternalTrackStrategy", "TrackCapability was not registered");
        return Boolean.FALSE;
    }

    private int l() {
        if (this.i.getTrackDataNum() >= this.f10976k.i().e("track.max_track_internal_data_size")) {
            this.j.d0(this.i.toJsonNode().r());
            this.i.clearData();
        }
        return this.j.size();
    }

    private mj1 m() {
        mj1 mj1VarCreateArrayNode;
        mj1 mj1VarCreateArrayNode2;
        synchronized (this.j) {
            try {
                if (this.i.getTrackDataNum() > 0) {
                    this.j.d0(this.i.toJsonNode().r());
                    this.i.clearData();
                }
                mj1VarCreateArrayNode = APIUtils.getObjectMapper().createArrayNode();
                if (this.j.size() > this.l) {
                    mj1VarCreateArrayNode2 = APIUtils.getObjectMapper().createArrayNode();
                    Iterator<zsd> it = this.j.iterator();
                    while (it.hasNext()) {
                        mj1VarCreateArrayNode2.d0(it.next());
                        if (mj1VarCreateArrayNode2.size() == this.l) {
                            mj1VarCreateArrayNode.e0(mj1VarCreateArrayNode2.toString());
                            mj1VarCreateArrayNode2.k0();
                        }
                    }
                    if (mj1VarCreateArrayNode2.size() > 0) {
                    }
                    this.j.k0();
                } else {
                    mj1VarCreateArrayNode2 = this.j;
                }
                mj1VarCreateArrayNode.e0(mj1VarCreateArrayNode2.toString());
                this.j.k0();
            } catch (Throwable th) {
                throw th;
            }
        }
        return mj1VarCreateArrayNode;
    }

    @Override // com.xiaomi.ai.android.track.b
    public boolean d() {
        return l() < this.l;
    }

    @Override // com.xiaomi.ai.android.track.b
    public boolean e() {
        int trackDataNum = this.i.getTrackDataNum();
        int size = this.j.size();
        wpe.b("InternalTrackStrategy", "isTrackDataEmpty ,bufferedTrackDataNum=" + trackDataNum + ",bufferedTrackInfoNum=" + size);
        return trackDataNum == 0 && size == 0;
    }

    @Override // com.xiaomi.ai.android.track.b
    public void h() {
        wpe.b("InternalTrackStrategy", "readLocalCache");
        TrackCapability trackCapability = (TrackCapability) this.f10976k.a(TrackCapability.class);
        if (trackCapability == null) {
            wpe.h("InternalTrackStrategy", "readLocalCache error:empty TrackCapability ");
            throw new IllegalArgumentException("readLocalCache error: TrackCapability was not registered");
        }
        mj1 localCache = trackCapability.readLocalCache();
        if (localCache == null || localCache.size() <= 0) {
            return;
        }
        this.j.f0(localCache);
    }

    @Override // com.xiaomi.ai.android.track.b
    public boolean i() {
        TrackCapability trackCapability = (TrackCapability) this.f10976k.a(TrackCapability.class);
        if (trackCapability == null) {
            throw new IllegalArgumentException("readLocalTrackData error:TrackCapability null");
        }
        mj1 localFailData = trackCapability.readLocalFailData();
        if (localFailData == null || localFailData.size() <= 0) {
            return false;
        }
        this.j.f0(localFailData);
        return true;
    }

    @Override // com.xiaomi.ai.android.track.b
    public boolean j() {
        mj1 mj1VarM = m();
        TrackCapability trackCapability = (TrackCapability) this.f10976k.a(TrackCapability.class);
        if (trackCapability != null) {
            return trackCapability.saveTrackData(mj1VarM);
        }
        return false;
    }

    @Override // com.xiaomi.ai.android.track.b
    public boolean k() {
        mj1 mj1VarM = m();
        if (mj1VarM == null || mj1VarM.size() == 0) {
            return true;
        }
        while (true) {
            boolean z = true;
            for (zsd zsdVar : mj1VarM) {
                if (!z || !a(zsdVar).booleanValue()) {
                    z = false;
                }
            }
            return false;
        }
    }
}
