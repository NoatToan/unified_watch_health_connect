package androidx.media3.exoplayer.hls.playlist;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import androidx.media3.common.ParserException;
import androidx.media3.common.q;
import androidx.media3.common.x;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.exoplayer.hls.HlsMediaSource;
import androidx.media3.exoplayer.source.k;
import androidx.media3.exoplayer.upstream.Loader;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import fa.z;
import ha.m;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import l0.e;
import ma.g;
import ma.l;
import n23.j;
import na.d;
import sa.i;

/* JADX INFO: loaded from: classes.dex */
public final class a implements HlsPlaylistTracker, Loader.b<androidx.media3.exoplayer.upstream.c<na.c>> {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final j f9057p = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f9058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f9059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.media3.exoplayer.upstream.b f9060c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap<Uri, c> f9061d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CopyOnWriteArrayList<HlsPlaylistTracker.a> f9062e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final double f9063f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public k.a f9064g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Loader f9065h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Handler f9066i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public HlsMediaSource f9067j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public androidx.media3.exoplayer.hls.playlist.c f9068k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Uri f9069l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public androidx.media3.exoplayer.hls.playlist.b f9070m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f9071n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f9072o;

    public class b implements HlsPlaylistTracker.a {
        private b() {
        }

        @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker.a
        public final void a() {
            a.this.f9062e.remove(this);
        }

        @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker.a
        public final boolean b(Uri uri, androidx.media3.exoplayer.upstream.b.c cVar, boolean z14) {
            c cVar2;
            a aVar = a.this;
            androidx.media3.exoplayer.hls.playlist.b bVar = aVar.f9070m;
            HashMap<Uri, c> map = aVar.f9061d;
            if (bVar == null) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                androidx.media3.exoplayer.hls.playlist.c cVar3 = aVar.f9068k;
                int i14 = z.f70071a;
                List<androidx.media3.exoplayer.hls.playlist.c.b> list = cVar3.f9130e;
                int i15 = 0;
                for (int i16 = 0; i16 < list.size(); i16++) {
                    c cVar4 = map.get(list.get(i16).f9142a);
                    if (cVar4 != null && jElapsedRealtime < cVar4.f9081h) {
                        i15++;
                    }
                }
                androidx.media3.exoplayer.upstream.b.C0129b c0129bA = aVar.f9060c.a(new androidx.media3.exoplayer.upstream.b.a(1, 0, aVar.f9068k.f9130e.size(), i15), cVar);
                if (c0129bA != null && c0129bA.f9721a == 2 && (cVar2 = map.get(uri)) != null) {
                    c.a(cVar2, c0129bA.f9722b);
                }
            }
            return false;
        }
    }

    public final class c implements Loader.b<androidx.media3.exoplayer.upstream.c<na.c>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f9074a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Loader f9075b = new Loader("DefaultHlsPlaylistTracker:MediaPlaylist");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ha.d f9076c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public androidx.media3.exoplayer.hls.playlist.b f9077d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f9078e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f9079f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f9080g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f9081h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f9082i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public IOException f9083j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f9084k;

        public c(Uri uri) {
            this.f9074a = uri;
            this.f9076c = a.this.f9058a.createDataSource();
        }

        public static boolean a(c cVar, long j8) {
            cVar.f9081h = SystemClock.elapsedRealtime() + j8;
            Uri uri = cVar.f9074a;
            a aVar = a.this;
            if (!uri.equals(aVar.f9069l)) {
                return false;
            }
            List<androidx.media3.exoplayer.hls.playlist.c.b> list = aVar.f9068k.f9130e;
            int size = list.size();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            for (int i14 = 0; i14 < size; i14++) {
                c cVar2 = aVar.f9061d.get(list.get(i14).f9142a);
                cVar2.getClass();
                if (jElapsedRealtime > cVar2.f9081h) {
                    Uri uri2 = cVar2.f9074a;
                    aVar.f9069l = uri2;
                    cVar2.e(aVar.q(uri2));
                    return false;
                }
            }
            return true;
        }

        public final Uri b() {
            androidx.media3.exoplayer.hls.playlist.b bVar = this.f9077d;
            Uri uri = this.f9074a;
            if (bVar != null) {
                androidx.media3.exoplayer.hls.playlist.b.f fVar = bVar.f9104v;
                if (fVar.f9123a != C.TIME_UNSET || fVar.f9127e) {
                    Uri.Builder builderBuildUpon = uri.buildUpon();
                    androidx.media3.exoplayer.hls.playlist.b bVar2 = this.f9077d;
                    if (bVar2.f9104v.f9127e) {
                        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(bVar2.f9093k + ((long) bVar2.f9100r.size())));
                        androidx.media3.exoplayer.hls.playlist.b bVar3 = this.f9077d;
                        if (bVar3.f9096n != C.TIME_UNSET) {
                            ImmutableList immutableList = bVar3.f9101s;
                            int size = immutableList.size();
                            if (!immutableList.isEmpty() && ((androidx.media3.exoplayer.hls.playlist.b.C0125b) Iterables.getLast(immutableList)).f9106m) {
                                size--;
                            }
                            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                        }
                    }
                    androidx.media3.exoplayer.hls.playlist.b.f fVar2 = this.f9077d.f9104v;
                    if (fVar2.f9123a != C.TIME_UNSET) {
                        builderBuildUpon.appendQueryParameter("_HLS_skip", fVar2.f9124b ? "v2" : "YES");
                    }
                    return builderBuildUpon.build();
                }
            }
            return uri;
        }

        public final void c(boolean z14) {
            e(z14 ? b() : this.f9074a);
        }

        public final void d(Uri uri) {
            a aVar = a.this;
            androidx.media3.exoplayer.upstream.c cVar = new androidx.media3.exoplayer.upstream.c(this.f9076c, uri, 4, aVar.f9059b.b(aVar.f9068k, this.f9077d));
            androidx.media3.exoplayer.upstream.b bVar = aVar.f9060c;
            int i14 = cVar.f9727c;
            aVar.f9064g.f(new i(cVar.f9725a, cVar.f9726b, this.f9075b.e(cVar, this, bVar.getMinimumLoadableRetryCount(i14))), i14, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET);
        }

        public final void e(Uri uri) {
            this.f9081h = 0L;
            if (this.f9082i) {
                return;
            }
            Loader loader = this.f9075b;
            if (loader.c() || loader.f9702c != null) {
                return;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j8 = this.f9080g;
            if (jElapsedRealtime >= j8) {
                d(uri);
            } else {
                this.f9082i = true;
                a.this.f9066i.postDelayed(new e(15, this, uri), j8 - jElapsedRealtime);
            }
        }

        /* JADX WARN: Code duplicated, block: B:102:0x026a  */
        /* JADX WARN: Code duplicated, block: B:105:0x027e  */
        /* JADX WARN: Code duplicated, block: B:113:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:24:0x005c  */
        /* JADX WARN: Code duplicated, block: B:26:0x0060  */
        /* JADX WARN: Code duplicated, block: B:28:0x0064  */
        /* JADX WARN: Code duplicated, block: B:29:0x006d  */
        /* JADX WARN: Code duplicated, block: B:31:0x00ca  */
        /* JADX WARN: Code duplicated, block: B:32:0x00d1  */
        /* JADX WARN: Code duplicated, block: B:34:0x00d9  */
        /* JADX WARN: Code duplicated, block: B:36:0x00de  */
        /* JADX WARN: Code duplicated, block: B:38:0x00e2  */
        /* JADX WARN: Code duplicated, block: B:39:0x00e5  */
        /* JADX WARN: Code duplicated, block: B:41:0x00e9  */
        /* JADX WARN: Code duplicated, block: B:42:0x00ec  */
        /* JADX WARN: Code duplicated, block: B:44:0x0103  */
        /* JADX WARN: Code duplicated, block: B:45:0x010a  */
        /* JADX WARN: Code duplicated, block: B:47:0x010d  */
        /* JADX WARN: Code duplicated, block: B:49:0x0112  */
        /* JADX WARN: Code duplicated, block: B:51:0x0119  */
        /* JADX WARN: Code duplicated, block: B:55:0x0122  */
        /* JADX WARN: Code duplicated, block: B:56:0x012a  */
        /* JADX WARN: Code duplicated, block: B:58:0x012e  */
        /* JADX WARN: Code duplicated, block: B:59:0x0131  */
        /* JADX WARN: Code duplicated, block: B:61:0x0134  */
        /* JADX WARN: Code duplicated, block: B:62:0x0136  */
        /* JADX WARN: Code duplicated, block: B:64:0x0143  */
        /* JADX WARN: Code duplicated, block: B:65:0x014a  */
        /* JADX WARN: Code duplicated, block: B:67:0x014d  */
        /* JADX WARN: Code duplicated, block: B:72:0x01c8  */
        /* JADX WARN: Code duplicated, block: B:74:0x01d4  */
        /* JADX WARN: Code duplicated, block: B:76:0x01d8  */
        /* JADX WARN: Code duplicated, block: B:81:0x01f3 A[LOOP:0: B:79:0x01ed->B:81:0x01f3, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:82:0x01fd  */
        /* JADX WARN: Code duplicated, block: B:84:0x0201  */
        /* JADX WARN: Code duplicated, block: B:86:0x0212  */
        /* JADX WARN: Code duplicated, block: B:87:0x021a  */
        /* JADX WARN: Code duplicated, block: B:89:0x022d  */
        /* JADX WARN: Code duplicated, block: B:91:0x0234  */
        /* JADX WARN: Code duplicated, block: B:93:0x0238  */
        /* JADX WARN: Code duplicated, block: B:96:0x0251 A[LOOP:1: B:94:0x024b->B:96:0x0251, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:99:0x0263  */
        /* JADX WARN: Multi-variable type inference failed */
        public final void f(androidx.media3.exoplayer.hls.playlist.b bVar, i iVar) {
            boolean z14;
            ImmutableList immutableList;
            long j8;
            long j14;
            boolean z15;
            androidx.media3.exoplayer.hls.playlist.b bVar2;
            long j15;
            long j16;
            ImmutableList immutableList2;
            int size;
            int i14;
            androidx.media3.exoplayer.hls.playlist.b.d dVar;
            long j17;
            long j18;
            long j19;
            androidx.media3.exoplayer.hls.playlist.b bVar3;
            int i15;
            int i16;
            ImmutableList immutableList3;
            androidx.media3.exoplayer.hls.playlist.b.d dVar2;
            int i17;
            androidx.media3.exoplayer.hls.playlist.b bVar4;
            IOException iOException;
            Uri uri;
            long size2;
            androidx.media3.exoplayer.hls.playlist.b bVar5;
            IOException playlistStuckException;
            boolean z16;
            androidx.media3.exoplayer.upstream.b.c cVar;
            Iterator<HlsPlaylistTracker.a> it;
            androidx.media3.exoplayer.hls.playlist.b bVar6;
            long j24;
            Iterator<HlsPlaylistTracker.a> it3;
            int size3;
            int size4;
            int size5;
            androidx.media3.exoplayer.hls.playlist.b bVar7 = this.f9077d;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f9078e = jElapsedRealtime;
            a aVar = a.this;
            aVar.getClass();
            CopyOnWriteArrayList<HlsPlaylistTracker.a> copyOnWriteArrayList = aVar.f9062e;
            if (bVar7 != null) {
                long j25 = bVar.f9093k;
                long j26 = bVar7.f9093k;
                z14 = j25 > j26 || (j25 >= j26 && ((size3 = bVar.f9100r.size() - bVar7.f9100r.size()) == 0 ? (size4 = bVar.f9101s.size()) > (size5 = bVar7.f9101s.size()) || (size4 == size5 && bVar.f9097o && !bVar7.f9097o) : size3 > 0));
                immutableList = bVar.f9100r;
                j8 = bVar.f9093k;
                j14 = 0;
                if (z14) {
                    copyOnWriteArrayList = copyOnWriteArrayList;
                    z15 = true;
                    if (bVar.f9098p) {
                        j18 = bVar.f9090h;
                    } else {
                        bVar2 = aVar.f9070m;
                        if (bVar2 != null) {
                            j15 = bVar2.f9090h;
                        } else {
                            j15 = 0;
                        }
                        if (bVar7 == null) {
                            long j27 = bVar7.f9090h;
                            j16 = bVar7.f9093k;
                            immutableList2 = bVar7.f9100r;
                            size = immutableList2.size();
                            i14 = (int) (j8 - j16);
                            if (i14 < immutableList2.size()) {
                                dVar = (androidx.media3.exoplayer.hls.playlist.b.d) immutableList2.get(i14);
                            } else {
                                dVar = null;
                            }
                            if (dVar != null) {
                                j17 = dVar.f9116e;
                            } else {
                                if (size == j8 - j16) {
                                    j17 = bVar7.f9103u;
                                }
                                if (bVar.f9091i) {
                                    i17 = bVar.f9092j;
                                } else {
                                    bVar3 = aVar.f9070m;
                                    if (bVar3 != null) {
                                        i15 = bVar3.f9092j;
                                    } else {
                                        i15 = 0;
                                    }
                                    if (bVar7 == null) {
                                        i16 = (int) (j8 - bVar7.f9093k);
                                        immutableList3 = bVar7.f9100r;
                                        if (i16 < immutableList3.size()) {
                                            dVar2 = (androidx.media3.exoplayer.hls.playlist.b.d) immutableList3.get(i16);
                                        } else {
                                            dVar2 = null;
                                        }
                                        if (dVar2 != null) {
                                            i15 = (bVar7.f9092j + dVar2.f9115d) - ((androidx.media3.exoplayer.hls.playlist.b.d) immutableList.get(0)).f9115d;
                                        }
                                    }
                                    i17 = i15;
                                }
                                iOException = null;
                                j8 = j8;
                                bVar4 = new androidx.media3.exoplayer.hls.playlist.b(bVar.f9086d, bVar.f125102a, bVar.f125103b, bVar.f9087e, bVar.f9089g, j19, true, i17, bVar.f9093k, bVar.f9094l, bVar.f9095m, bVar.f9096n, bVar.f125104c, bVar.f9097o, bVar.f9098p, bVar.f9099q, immutableList, bVar.f9101s, bVar.f9104v, bVar.f9102t);
                            }
                            j18 = j27 + j17;
                        }
                        j19 = j15;
                        if (bVar.f9091i) {
                            i17 = bVar.f9092j;
                        } else {
                            bVar3 = aVar.f9070m;
                            if (bVar3 != null) {
                                i15 = bVar3.f9092j;
                            } else {
                                i15 = 0;
                            }
                            if (bVar7 == null) {
                                i16 = (int) (j8 - bVar7.f9093k);
                                immutableList3 = bVar7.f9100r;
                                if (i16 < immutableList3.size()) {
                                    dVar2 = (androidx.media3.exoplayer.hls.playlist.b.d) immutableList3.get(i16);
                                } else {
                                    dVar2 = null;
                                }
                                if (dVar2 != null) {
                                    i15 = (bVar7.f9092j + dVar2.f9115d) - ((androidx.media3.exoplayer.hls.playlist.b.d) immutableList.get(0)).f9115d;
                                }
                            }
                            i17 = i15;
                        }
                        iOException = null;
                        j8 = j8;
                        bVar4 = new androidx.media3.exoplayer.hls.playlist.b(bVar.f9086d, bVar.f125102a, bVar.f125103b, bVar.f9087e, bVar.f9089g, j19, true, i17, bVar.f9093k, bVar.f9094l, bVar.f9095m, bVar.f9096n, bVar.f125104c, bVar.f9097o, bVar.f9098p, bVar.f9099q, immutableList, bVar.f9101s, bVar.f9104v, bVar.f9102t);
                    }
                    j19 = j18;
                    if (bVar.f9091i) {
                        i17 = bVar.f9092j;
                    } else {
                        bVar3 = aVar.f9070m;
                        if (bVar3 != null) {
                            i15 = bVar3.f9092j;
                        } else {
                            i15 = 0;
                        }
                        if (bVar7 == null) {
                            i16 = (int) (j8 - bVar7.f9093k);
                            immutableList3 = bVar7.f9100r;
                            if (i16 < immutableList3.size()) {
                                dVar2 = (androidx.media3.exoplayer.hls.playlist.b.d) immutableList3.get(i16);
                            } else {
                                dVar2 = null;
                            }
                            if (dVar2 != null) {
                                i15 = (bVar7.f9092j + dVar2.f9115d) - ((androidx.media3.exoplayer.hls.playlist.b.d) immutableList.get(0)).f9115d;
                            }
                        }
                        i17 = i15;
                    }
                    iOException = null;
                    j8 = j8;
                    bVar4 = new androidx.media3.exoplayer.hls.playlist.b(bVar.f9086d, bVar.f125102a, bVar.f125103b, bVar.f9087e, bVar.f9089g, j19, true, i17, bVar.f9093k, bVar.f9094l, bVar.f9095m, bVar.f9096n, bVar.f125104c, bVar.f9097o, bVar.f9098p, bVar.f9099q, immutableList, bVar.f9101s, bVar.f9104v, bVar.f9102t);
                } else {
                    if (bVar.f9097o) {
                        z15 = true;
                        bVar4 = bVar7;
                    } else if (bVar7.f9097o) {
                        bVar4 = bVar7;
                        copyOnWriteArrayList = copyOnWriteArrayList;
                        j8 = j8;
                        iOException = null;
                        z15 = true;
                    } else {
                        z15 = true;
                        bVar4 = new androidx.media3.exoplayer.hls.playlist.b(bVar7.f9086d, bVar7.f125102a, bVar7.f125103b, bVar7.f9087e, bVar7.f9089g, bVar7.f9090h, bVar7.f9091i, bVar7.f9092j, bVar7.f9093k, bVar7.f9094l, bVar7.f9095m, bVar7.f9096n, bVar7.f125104c, true, bVar7.f9098p, bVar7.f9099q, bVar7.f9100r, bVar7.f9101s, bVar7.f9104v, bVar7.f9102t);
                    }
                    iOException = null;
                }
                this.f9077d = bVar4;
                uri = this.f9074a;
                if (bVar4 != bVar7) {
                    this.f9083j = iOException;
                    this.f9079f = jElapsedRealtime;
                    if (uri.equals(aVar.f9069l)) {
                        if (aVar.f9070m == null) {
                            aVar.f9071n = !bVar4.f9097o;
                            aVar.f9072o = bVar4.f9090h;
                        }
                        aVar.f9070m = bVar4;
                        aVar.f9067j.t(bVar4);
                    }
                    it3 = copyOnWriteArrayList.iterator();
                    while (it3.hasNext()) {
                        it3.next().a();
                    }
                } else if (!bVar4.f9097o) {
                    size2 = j8 + ((long) bVar.f9100r.size());
                    bVar5 = this.f9077d;
                    if (size2 < bVar5.f9093k) {
                        playlistStuckException = new HlsPlaylistTracker.PlaylistResetException(uri);
                        z16 = z15;
                    } else {
                        if (jElapsedRealtime - this.f9079f > z.Y(bVar5.f9095m) * aVar.f9063f) {
                            playlistStuckException = new HlsPlaylistTracker.PlaylistStuckException(uri);
                        } else {
                            playlistStuckException = iOException;
                        }
                        z16 = false;
                    }
                    if (playlistStuckException != null) {
                        this.f9083j = playlistStuckException;
                        cVar = new androidx.media3.exoplayer.upstream.b.c(iVar, new sa.j(4), playlistStuckException, z15 ? 1 : 0);
                        it = copyOnWriteArrayList.iterator();
                        while (it.hasNext()) {
                            it.next().b(uri, cVar, z16);
                        }
                    }
                }
                bVar6 = this.f9077d;
                if (!bVar6.f9104v.f9127e) {
                    j24 = bVar6.f9095m;
                    if (bVar6 == bVar7) {
                        j24 /= 2;
                    }
                    j14 = j24;
                }
                this.f9080g = (z.Y(j14) + jElapsedRealtime) - iVar.f158117b;
                if (this.f9077d.f9097o) {
                }
                if (!uri.equals(aVar.f9069l) || this.f9084k) {
                    e(b());
                }
                return;
            }
            bVar.getClass();
            immutableList = bVar.f9100r;
            j8 = bVar.f9093k;
            j14 = 0;
            if (z14) {
                if (bVar.f9097o) {
                    z15 = true;
                    bVar4 = bVar7;
                } else if (bVar7.f9097o) {
                    bVar4 = bVar7;
                    copyOnWriteArrayList = copyOnWriteArrayList;
                    j8 = j8;
                    iOException = null;
                    z15 = true;
                } else {
                    z15 = true;
                    bVar4 = new androidx.media3.exoplayer.hls.playlist.b(bVar7.f9086d, bVar7.f125102a, bVar7.f125103b, bVar7.f9087e, bVar7.f9089g, bVar7.f9090h, bVar7.f9091i, bVar7.f9092j, bVar7.f9093k, bVar7.f9094l, bVar7.f9095m, bVar7.f9096n, bVar7.f125104c, true, bVar7.f9098p, bVar7.f9099q, bVar7.f9100r, bVar7.f9101s, bVar7.f9104v, bVar7.f9102t);
                }
                iOException = null;
            } else {
                copyOnWriteArrayList = copyOnWriteArrayList;
                z15 = true;
                if (bVar.f9098p) {
                    j18 = bVar.f9090h;
                } else {
                    bVar2 = aVar.f9070m;
                    if (bVar2 != null) {
                        j15 = bVar2.f9090h;
                    } else {
                        j15 = 0;
                    }
                    if (bVar7 == null) {
                        long j28 = bVar7.f9090h;
                        j16 = bVar7.f9093k;
                        immutableList2 = bVar7.f9100r;
                        size = immutableList2.size();
                        i14 = (int) (j8 - j16);
                        if (i14 < immutableList2.size()) {
                            dVar = (androidx.media3.exoplayer.hls.playlist.b.d) immutableList2.get(i14);
                        } else {
                            dVar = null;
                        }
                        if (dVar != null) {
                            j17 = dVar.f9116e;
                        } else {
                            if (size == j8 - j16) {
                                j17 = bVar7.f9103u;
                            }
                            if (bVar.f9091i) {
                                i17 = bVar.f9092j;
                            } else {
                                bVar3 = aVar.f9070m;
                                if (bVar3 != null) {
                                    i15 = bVar3.f9092j;
                                } else {
                                    i15 = 0;
                                }
                                if (bVar7 == null) {
                                    i16 = (int) (j8 - bVar7.f9093k);
                                    immutableList3 = bVar7.f9100r;
                                    if (i16 < immutableList3.size()) {
                                        dVar2 = (androidx.media3.exoplayer.hls.playlist.b.d) immutableList3.get(i16);
                                    } else {
                                        dVar2 = null;
                                    }
                                    if (dVar2 != null) {
                                        i15 = (bVar7.f9092j + dVar2.f9115d) - ((androidx.media3.exoplayer.hls.playlist.b.d) immutableList.get(0)).f9115d;
                                    }
                                }
                                i17 = i15;
                            }
                            iOException = null;
                            j8 = j8;
                            bVar4 = new androidx.media3.exoplayer.hls.playlist.b(bVar.f9086d, bVar.f125102a, bVar.f125103b, bVar.f9087e, bVar.f9089g, j19, true, i17, bVar.f9093k, bVar.f9094l, bVar.f9095m, bVar.f9096n, bVar.f125104c, bVar.f9097o, bVar.f9098p, bVar.f9099q, immutableList, bVar.f9101s, bVar.f9104v, bVar.f9102t);
                        }
                        j18 = j28 + j17;
                    }
                    j19 = j15;
                    if (bVar.f9091i) {
                        i17 = bVar.f9092j;
                    } else {
                        bVar3 = aVar.f9070m;
                        if (bVar3 != null) {
                            i15 = bVar3.f9092j;
                        } else {
                            i15 = 0;
                        }
                        if (bVar7 == null) {
                            i16 = (int) (j8 - bVar7.f9093k);
                            immutableList3 = bVar7.f9100r;
                            if (i16 < immutableList3.size()) {
                                dVar2 = (androidx.media3.exoplayer.hls.playlist.b.d) immutableList3.get(i16);
                            } else {
                                dVar2 = null;
                            }
                            if (dVar2 != null) {
                                i15 = (bVar7.f9092j + dVar2.f9115d) - ((androidx.media3.exoplayer.hls.playlist.b.d) immutableList.get(0)).f9115d;
                            }
                        }
                        i17 = i15;
                    }
                    iOException = null;
                    j8 = j8;
                    bVar4 = new androidx.media3.exoplayer.hls.playlist.b(bVar.f9086d, bVar.f125102a, bVar.f125103b, bVar.f9087e, bVar.f9089g, j19, true, i17, bVar.f9093k, bVar.f9094l, bVar.f9095m, bVar.f9096n, bVar.f125104c, bVar.f9097o, bVar.f9098p, bVar.f9099q, immutableList, bVar.f9101s, bVar.f9104v, bVar.f9102t);
                }
                j19 = j18;
                if (bVar.f9091i) {
                    i17 = bVar.f9092j;
                } else {
                    bVar3 = aVar.f9070m;
                    if (bVar3 != null) {
                        i15 = bVar3.f9092j;
                    } else {
                        i15 = 0;
                    }
                    if (bVar7 == null) {
                        i16 = (int) (j8 - bVar7.f9093k);
                        immutableList3 = bVar7.f9100r;
                        if (i16 < immutableList3.size()) {
                            dVar2 = (androidx.media3.exoplayer.hls.playlist.b.d) immutableList3.get(i16);
                        } else {
                            dVar2 = null;
                        }
                        if (dVar2 != null) {
                            i15 = (bVar7.f9092j + dVar2.f9115d) - ((androidx.media3.exoplayer.hls.playlist.b.d) immutableList.get(0)).f9115d;
                        }
                    }
                    i17 = i15;
                }
                iOException = null;
                j8 = j8;
                bVar4 = new androidx.media3.exoplayer.hls.playlist.b(bVar.f9086d, bVar.f125102a, bVar.f125103b, bVar.f9087e, bVar.f9089g, j19, true, i17, bVar.f9093k, bVar.f9094l, bVar.f9095m, bVar.f9096n, bVar.f125104c, bVar.f9097o, bVar.f9098p, bVar.f9099q, immutableList, bVar.f9101s, bVar.f9104v, bVar.f9102t);
            }
            this.f9077d = bVar4;
            uri = this.f9074a;
            if (bVar4 != bVar7) {
                this.f9083j = iOException;
                this.f9079f = jElapsedRealtime;
                if (uri.equals(aVar.f9069l)) {
                    if (aVar.f9070m == null) {
                        aVar.f9071n = !bVar4.f9097o;
                        aVar.f9072o = bVar4.f9090h;
                    }
                    aVar.f9070m = bVar4;
                    aVar.f9067j.t(bVar4);
                }
                it3 = copyOnWriteArrayList.iterator();
                while (it3.hasNext()) {
                    it3.next().a();
                }
            } else if (!bVar4.f9097o) {
                size2 = j8 + ((long) bVar.f9100r.size());
                bVar5 = this.f9077d;
                if (size2 < bVar5.f9093k) {
                    playlistStuckException = new HlsPlaylistTracker.PlaylistResetException(uri);
                    z16 = z15;
                } else {
                    if (jElapsedRealtime - this.f9079f > z.Y(bVar5.f9095m) * aVar.f9063f) {
                        playlistStuckException = new HlsPlaylistTracker.PlaylistStuckException(uri);
                    } else {
                        playlistStuckException = iOException;
                    }
                    z16 = false;
                }
                if (playlistStuckException != null) {
                    this.f9083j = playlistStuckException;
                    cVar = new androidx.media3.exoplayer.upstream.b.c(iVar, new sa.j(4), playlistStuckException, z15 ? 1 : 0);
                    it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        it.next().b(uri, cVar, z16);
                    }
                }
            }
            bVar6 = this.f9077d;
            if (!bVar6.f9104v.f9127e) {
                j24 = bVar6.f9095m;
                if (bVar6 == bVar7) {
                    j24 /= 2;
                }
                j14 = j24;
            }
            this.f9080g = (z.Y(j14) + jElapsedRealtime) - iVar.f158117b;
            if (this.f9077d.f9097o) {
                if (uri.equals(aVar.f9069l)) {
                }
                e(b());
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.media3.exoplayer.upstream.Loader.b
        public final void g(Loader.e eVar, long j8, long j14) {
            androidx.media3.exoplayer.upstream.c cVar = (androidx.media3.exoplayer.upstream.c) eVar;
            na.c cVar2 = (na.c) cVar.f9730f;
            long j15 = cVar.f9725a;
            ha.g gVar = cVar.f9726b;
            m mVar = cVar.f9728d;
            i iVar = new i(j15, gVar, mVar.f82618c, mVar.f82619d, j8, j14, mVar.f82617b);
            if (cVar2 instanceof androidx.media3.exoplayer.hls.playlist.b) {
                f((androidx.media3.exoplayer.hls.playlist.b) cVar2, iVar);
                a.this.f9064g.c(iVar, 4, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET);
            } else {
                ParserException parserExceptionCreateForMalformedManifest = ParserException.createForMalformedManifest("Loaded playlist has unexpected type.", null);
                this.f9083j = parserExceptionCreateForMalformedManifest;
                a.this.f9064g.e(iVar, 4, parserExceptionCreateForMalformedManifest, true);
            }
            a.this.f9060c.getClass();
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.b
        public final Loader.c i(Loader.e eVar, long j8, long j14, IOException iOException, int i14) {
            Loader.c cVarB;
            androidx.media3.exoplayer.upstream.c cVar = (androidx.media3.exoplayer.upstream.c) eVar;
            long j15 = cVar.f9725a;
            int i15 = cVar.f9727c;
            ha.g gVar = cVar.f9726b;
            m mVar = cVar.f9728d;
            i iVar = new i(j15, gVar, mVar.f82618c, mVar.f82619d, j8, j14, mVar.f82617b);
            boolean z14 = true;
            boolean z15 = mVar.f82618c.getQueryParameter("_HLS_msn") != null;
            boolean z16 = iOException instanceof HlsPlaylistParser.DeltaUpdateException;
            a aVar = a.this;
            if (z15 || z16) {
                int i16 = iOException instanceof HttpDataSource$InvalidResponseCodeException ? ((HttpDataSource$InvalidResponseCodeException) iOException).responseCode : Integer.MAX_VALUE;
                if (z16 || i16 == 400 || i16 == 503) {
                    this.f9080g = SystemClock.elapsedRealtime();
                    c(false);
                    k.a aVar2 = aVar.f9064g;
                    int i17 = z.f70071a;
                    aVar2.e(iVar, i15, iOException, true);
                    return Loader.f9698e;
                }
            }
            androidx.media3.exoplayer.upstream.b.c cVar2 = new androidx.media3.exoplayer.upstream.b.c(iVar, new sa.j(i15), iOException, i14);
            Iterator<HlsPlaylistTracker.a> it = aVar.f9062e.iterator();
            boolean z17 = false;
            while (it.hasNext()) {
                z17 |= !it.next().b(this.f9074a, cVar2, false);
            }
            androidx.media3.exoplayer.upstream.b bVar = aVar.f9060c;
            if (z17) {
                long jB = bVar.b(cVar2);
                cVarB = jB != C.TIME_UNSET ? Loader.b(jB, false) : Loader.f9699f;
            } else {
                cVarB = Loader.f9698e;
            }
            int i18 = cVarB.f9703a;
            if (i18 != 0 && i18 != 1) {
                z14 = false;
            }
            aVar.f9064g.e(iVar, i15, iOException, !z14);
            if (!z14) {
                bVar.getClass();
            }
            return cVarB;
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.b
        public final void l(Loader.e eVar, long j8, long j14, boolean z14) {
            androidx.media3.exoplayer.upstream.c cVar = (androidx.media3.exoplayer.upstream.c) eVar;
            long j15 = cVar.f9725a;
            ha.g gVar = cVar.f9726b;
            m mVar = cVar.f9728d;
            i iVar = new i(j15, gVar, mVar.f82618c, mVar.f82619d, j8, j14, mVar.f82617b);
            a aVar = a.this;
            aVar.f9060c.getClass();
            aVar.f9064g.b(iVar, 4, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET);
        }
    }

    public a(g gVar, androidx.media3.exoplayer.upstream.b bVar, d dVar, double d14) {
        this.f9058a = gVar;
        this.f9059b = dVar;
        this.f9060c = bVar;
        this.f9063f = d14;
        this.f9062e = new CopyOnWriteArrayList<>();
        this.f9061d = new HashMap<>();
        this.f9072o = C.TIME_UNSET;
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public final void a(Uri uri, k.a aVar, HlsMediaSource hlsMediaSource) {
        this.f9066i = z.m(null);
        this.f9064g = aVar;
        this.f9067j = hlsMediaSource;
        androidx.media3.exoplayer.upstream.c cVar = new androidx.media3.exoplayer.upstream.c(this.f9058a.createDataSource(), uri, 4, this.f9059b.a());
        fa.a.d(this.f9065h == null);
        Loader loader = new Loader("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        this.f9065h = loader;
        androidx.media3.exoplayer.upstream.b bVar = this.f9060c;
        int i14 = cVar.f9727c;
        aVar.f(new i(cVar.f9725a, cVar.f9726b, loader.e(cVar, this, bVar.getMinimumLoadableRetryCount(i14))), i14, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET);
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public final void b(l lVar) {
        this.f9062e.remove(lVar);
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public final void c(Uri uri) {
        c cVar = this.f9061d.get(uri);
        if (cVar != null) {
            cVar.f9084k = false;
        }
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public final androidx.media3.exoplayer.hls.playlist.c d() {
        return this.f9068k;
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public final void e(l lVar) {
        this.f9062e.add(lVar);
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public final void f() throws IOException {
        Loader loader = this.f9065h;
        if (loader != null) {
            IOException iOException = loader.f9702c;
            if (iOException != null) {
                throw iOException;
            }
            Loader.d<? extends Loader.e> dVar = loader.f9701b;
            if (dVar != null) {
                int i14 = dVar.f9705a;
                IOException iOException2 = dVar.f9709e;
                if (iOException2 != null && dVar.f9710f > i14) {
                    throw iOException2;
                }
            }
        }
        Uri uri = this.f9069l;
        if (uri != null) {
            m(uri);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.media3.exoplayer.upstream.Loader.b
    public final void g(Loader.e eVar, long j8, long j14) {
        androidx.media3.exoplayer.hls.playlist.c cVar;
        androidx.media3.exoplayer.upstream.c cVar2 = (androidx.media3.exoplayer.upstream.c) eVar;
        na.c cVar3 = (na.c) cVar2.f9730f;
        boolean z14 = cVar3 instanceof androidx.media3.exoplayer.hls.playlist.b;
        if (z14) {
            String str = cVar3.f125102a;
            androidx.media3.exoplayer.hls.playlist.c cVar4 = androidx.media3.exoplayer.hls.playlist.c.f9128n;
            Uri uri = Uri.parse(str);
            q.b bVar = new q.b();
            bVar.f8399a = "0";
            bVar.f8410l = x.n(MimeTypes.APPLICATION_M3U8);
            List listSingletonList = Collections.singletonList(new androidx.media3.exoplayer.hls.playlist.c.b(uri, bVar.a(), null, null, null, null));
            List list = Collections.EMPTY_LIST;
            cVar = new androidx.media3.exoplayer.hls.playlist.c("", list, listSingletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
        } else {
            cVar = (androidx.media3.exoplayer.hls.playlist.c) cVar3;
        }
        this.f9068k = cVar;
        this.f9069l = cVar.f9130e.get(0).f9142a;
        this.f9062e.add(new b());
        List<Uri> list2 = cVar.f9129d;
        int size = list2.size();
        for (int i14 = 0; i14 < size; i14++) {
            Uri uri2 = list2.get(i14);
            this.f9061d.put(uri2, new c(uri2));
        }
        long j15 = cVar2.f9725a;
        ha.g gVar = cVar2.f9726b;
        m mVar = cVar2.f9728d;
        i iVar = new i(j15, gVar, mVar.f82618c, mVar.f82619d, j8, j14, mVar.f82617b);
        c cVar5 = this.f9061d.get(this.f9069l);
        if (z14) {
            cVar5.f((androidx.media3.exoplayer.hls.playlist.b) cVar3, iVar);
        } else {
            cVar5.c(false);
        }
        this.f9060c.getClass();
        this.f9064g.c(iVar, 4, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET);
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public final androidx.media3.exoplayer.hls.playlist.b h(Uri uri, boolean z14) {
        HashMap<Uri, c> map = this.f9061d;
        androidx.media3.exoplayer.hls.playlist.b bVar = map.get(uri).f9077d;
        if (bVar != null && z14) {
            if (!uri.equals(this.f9069l)) {
                List<androidx.media3.exoplayer.hls.playlist.c.b> list = this.f9068k.f9130e;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    if (uri.equals(list.get(i14).f9142a)) {
                        androidx.media3.exoplayer.hls.playlist.b bVar2 = this.f9070m;
                        if (bVar2 != null && bVar2.f9097o) {
                            break;
                        }
                        this.f9069l = uri;
                        c cVar = map.get(uri);
                        androidx.media3.exoplayer.hls.playlist.b bVar3 = cVar.f9077d;
                        if (bVar3 != null && bVar3.f9097o) {
                            this.f9070m = bVar3;
                            this.f9067j.t(bVar3);
                            break;
                        }
                        cVar.e(q(uri));
                        break;
                    }
                }
            }
            c cVar2 = map.get(uri);
            androidx.media3.exoplayer.hls.playlist.b bVar4 = cVar2.f9077d;
            if (!cVar2.f9084k) {
                cVar2.f9084k = true;
                if (bVar4 != null && !bVar4.f9097o) {
                    cVar2.c(true);
                }
            }
        }
        return bVar;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.b
    public final Loader.c i(Loader.e eVar, long j8, long j14, IOException iOException, int i14) {
        androidx.media3.exoplayer.upstream.c cVar = (androidx.media3.exoplayer.upstream.c) eVar;
        long j15 = cVar.f9725a;
        ha.g gVar = cVar.f9726b;
        m mVar = cVar.f9728d;
        i iVar = new i(j15, gVar, mVar.f82618c, mVar.f82619d, j8, j14, mVar.f82617b);
        int i15 = cVar.f9727c;
        long jB = this.f9060c.b(new androidx.media3.exoplayer.upstream.b.c(iVar, new sa.j(i15), iOException, i14));
        boolean z14 = jB == C.TIME_UNSET;
        this.f9064g.e(iVar, i15, iOException, z14);
        return z14 ? Loader.f9699f : Loader.b(jB, false);
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public final long j() {
        return this.f9072o;
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public final boolean k(long j8, Uri uri) {
        c cVar = this.f9061d.get(uri);
        if (cVar != null) {
            return !c.a(cVar, j8);
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.b
    public final void l(Loader.e eVar, long j8, long j14, boolean z14) {
        androidx.media3.exoplayer.upstream.c cVar = (androidx.media3.exoplayer.upstream.c) eVar;
        long j15 = cVar.f9725a;
        ha.g gVar = cVar.f9726b;
        m mVar = cVar.f9728d;
        i iVar = new i(j15, gVar, mVar.f82618c, mVar.f82619d, j8, j14, mVar.f82617b);
        this.f9060c.getClass();
        this.f9064g.b(iVar, 4, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET);
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public final void m(Uri uri) throws IOException {
        c cVar = this.f9061d.get(uri);
        Loader loader = cVar.f9075b;
        IOException iOException = loader.f9702c;
        if (iOException != null) {
            throw iOException;
        }
        Loader.d<? extends Loader.e> dVar = loader.f9701b;
        if (dVar != null) {
            int i14 = dVar.f9705a;
            IOException iOException2 = dVar.f9709e;
            if (iOException2 != null && dVar.f9710f > i14) {
                throw iOException2;
            }
        }
        IOException iOException3 = cVar.f9083j;
        if (iOException3 != null) {
            throw iOException3;
        }
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public final void n(Uri uri) {
        this.f9061d.get(uri).c(true);
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public final boolean o(Uri uri) {
        int i14;
        c cVar = this.f9061d.get(uri);
        if (cVar.f9077d == null) {
            return false;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jMax = Math.max(30000L, z.Y(cVar.f9077d.f9103u));
        androidx.media3.exoplayer.hls.playlist.b bVar = cVar.f9077d;
        return bVar.f9097o || (i14 = bVar.f9086d) == 2 || i14 == 1 || cVar.f9078e + jMax > jElapsedRealtime;
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public final boolean p() {
        return this.f9071n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Uri q(Uri uri) {
        androidx.media3.exoplayer.hls.playlist.b.c cVar;
        androidx.media3.exoplayer.hls.playlist.b bVar = this.f9070m;
        if (bVar == null || !bVar.f9104v.f9127e || (cVar = (androidx.media3.exoplayer.hls.playlist.b.c) bVar.f9102t.get(uri)) == null) {
            return uri;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(cVar.f9108b));
        int i14 = cVar.f9109c;
        if (i14 != -1) {
            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(i14));
        }
        return builderBuildUpon.build();
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public final void stop() {
        this.f9069l = null;
        this.f9070m = null;
        this.f9068k = null;
        this.f9072o = C.TIME_UNSET;
        this.f9065h.d(null);
        this.f9065h = null;
        HashMap<Uri, c> map = this.f9061d;
        Iterator<c> it = map.values().iterator();
        while (it.hasNext()) {
            it.next().f9075b.d(null);
        }
        this.f9066i.removeCallbacksAndMessages(null);
        this.f9066i = null;
        map.clear();
    }

    public a(g gVar, androidx.media3.exoplayer.upstream.b bVar, d dVar) {
        this(gVar, bVar, dVar, 3.5d);
    }
}
