package bs2;

import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.activities.model.PrivacyUpdateRequestError;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.wallet.WalletConstants;
import com.google.mlkit.common.MlKitException;
import okhttp3.internal.http.StatusLine;

/* JADX INFO: loaded from: classes11.dex */
public class wb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bk[] f20642a = {id.f20213e, dd.f20053e, kd.f20258e, tx.f20588e, zb.f20712e, pc.f20400e, jc.f20231e, bc.f19747e, dc.f20052e, nc.f20329e, xb.f20666e, wa.f20641e, oi.f20381e, eg.f20079e, k9.f20255e, i9.f20210e, du.f20062e, ft.f20143e, b5.f19687e, bd.f19748e, dk.f20056e, tc.f20574e, fd.f20130e, zj.f20715e, xj.f20669e, s7.f20475e, q7.f20425e, e00.f20068e, sg.f20509e, nr.f20336e, x2.f20661e, v.f20606e, xi.f20668e, b3.f19686e, v2.f20609e, v5.f20612e, bs.f19759e, w10.f20636e, f3.f20113e, h3.f20175e, j3.f20228e, km.f20267e, vd.f20619e, d3.f20048e, px.f20417e, o10.f20370e, p0.f20392e, c10.f19768e, ul.f20601e, ol.f20383e, q00.f20421e, w20.f20637e, pv.f20409e, mg.f20312e, lu.f20286e, r4.f20450e, tn.f20579e, mk.f20315e, c7.f19775e, wy.f20654e, qy.f20443e, oy.f20390e, gy.f20171e, my.f20320e, yy.f20699e, lj.f20280e, jj.f20233e, xn.f20670e, mm.f20317e, pq.f20406e, qk.f20435e, t5.f20572e, j2.f20227e, v1.f20608e, t1.f20568e, e8.f20075e, w7.f20638e, y7.f20683e, a8.f19659e, c8.f19776e, ln.f20281e, gl.f20168e, el.f20082e, ym.f20694e, os.f20385e, te.f20576e, t.f20566e, r5.f20451e, fs.f20142e, ti.f20577e, vi.f20623e, zp.f21022e, qw.f20442e, bb.f19746e, ju.f20243e, wl.f20651e, o7.f20372e, k7.f20253e, iy.f20224e, od.f20377e, h2.f20174e, vn.f20625e, a20.f19657e, y10.f20682e, qd.f20430e, cf.f19779e, af.f19676e, ef.f20078e, x4.f20663e, v4.f20611e, uf.f20597e, o.f20365e, dj.f20055e, x1.f20660e, nx.f20364e, om.f20384e, i10.f20206e, im.f20219e, td.f20575e, gm.f20169e, r1.f20447e, m10.f20293e, q10.f20422e, g10.f20150e, e10.f20069e, ei.f20081e, ci.f19782e, z4.f20709e, ks.f20268e, qi.f20434e, ms.f20318e, sm.f20538e, um.f20602e, fv.f20145e, jv.f20244e, hv.f20200e, k10.f20250e, l5.f20275e, w8.f20639e, y8.f20684e, u8.f20593e, nn.f20332e, pn.f20403e, yc.f20687e, e7.f20074e, of.f20378e, cy.f20041e, mf.f20311e, kf.f20259e, cm.f20038e, ml.f20316e, z5.f20710e, b6.f19688e, l1.f20272e, j1.f20226e, tr.f20583e, xr.f20674e, zr.f21024e, vr.f20629e, rr.f20467e, q20.f20423e, s20.f20474e, u20.f20591e, qb.f20429e, dr.f20059e, sy.f20564e, fr.f20141e, bj.f19750e, zx.f21030e, g20.f20151e, p3.f20395e, de.f20054e, be.f19749e, zd.f20713e, fe.f20131e, wk.f20650e, yk.f20692e, uk.f20600e, ds.f20060e, hs.f20197e, lv.f20287e, sk.f20536e, jr.f20238e, kg.f20260e, og.f20379e, t2.f20569e, z2.f20703e, wz.f20655e, qz.f20444e, sz.f20565e, a00.f19655e, oz.f20391e, mz.f20321e, yz.f20700e, en.f20084e, gn.f20170e, co.f20040e, he.f20190e, zw.f21029e, bx.f19764e, n5.f20327e, lq.f20284e, jq.f20237e, qf.f20431e, nq.f20335e, jn.f20234e, x5.f20664e, ts.f20584e, ye.f20688e, we.f20646e, t4.f20571e, az.f19683e, cz.f20042e, x3.f20662e, lw.f20288e, fj.f20132e, pj.f20402e, bq.f19757e, ky.f20270e, ey.f20085e, ok.f20382e, cn.f20039e, dw.f20064e, uy.f20604e, y.f20680e, xq.f20673e, vq.f20628e, tq.f20582e, hq.f20195e, f2.f20088e, z1.f20702e, b2.f19685e, d2.f20044e, p1.f20393e, ch.f19781e, gh.f20166e, ah.f19678e, ih.f20215e, mh.f20313e, sh.f20510e, qh.f20433e, uh.f20599e, oh.f20380e, kh.f20261e, eh.f20080e, wh.f20649e, xd.f20667e, tj.f20578e, am.f19681e, yl.f20693e, ot.f20386e, ut.f20603e, g9.f20155e, r6.f20452e, x6.f20665e, p6.f20399e, s8.f20476e, ii.f20216e, gi.f20167e, nw.f20363e, t6.f20573e, v6.f20613e, lr.f20285e, qg.f20432e, o20.f20371e, uz.f20605e, n6.f20328e, t0.f20567e, x0.f20659e, z0.f20701e, d1.f20043e, c.f19765e, bw.f19763e, zv.f21028e, vu.f20631e, nu.f20337e, tu.f20585e, zu.f21027e, pu.f20408e, w00.f20635e, ru.f20469e, e4.f20073e, a4.f19658e, xu.f20676e, u00.f20589e, dv.f20063e, k4.f20252e, i4.f20208e, m.f20290e, g.f20148e, lx.f20289e, g4.f20152e, xw.f20678e, r.f20445e, z6.f20711e, f6.f20115e, d6.f20050e, br.f19758e, c4.f19774e, bv.f19762e, y00.f20681e, s00.f20472e, a10.f19656e, b1.f19684e, k20.f20251e, kb.f20257e, ib.f20212e, gb.f20157e, m20.f20294e, i20.f20207e, vj.f20624e, rq.f20466e, mi.f20314e, ki.f20262e, i8.f20209e, o8.f20373e, n3.f20324e, l3.f20274e, jw.f20245e, hw.f20201e, fw.f20146e, k.f20247e, i.f20203e, e.f20066e, m8.f20306e, m00.f20292e, o00.f20369e, k00.f20249e, m7.f20305e, n1.f20322e, g8.f20154e, d5.f20049e, f5.f20114e, bu.f19761e, wf.f20647e, zi.f20714e, k8.f20254e, md.f20310e, a.f19653e, ug.f20598e, r2.f20448e, wg.f20648e, gg.f20165e, yg.f20690e, vp.f20627e, l2.f20273e, al.f19680e, ya.f20686e, dx.f20065e, ql.f20436e, an.f19682e, u10.f20590e, rv.f20470e, dq.f20058e, fq.f20140e, sf.f20508e, rs.f20468e, xs.f20675e, vs.f20630e, zs.f21025e, j5.f20229e, h5.f20176e, h1.f20173e, f1.f20087e, cl.f20037e, hf.f20191e, fu.f20144e, jx.f20246e, rj.f20462e, rn.f20463e, p5.f20398e, hx.f20202e, v0.f20607e, re.f20461e, pe.f20401e, u7.f20592e, je.f20232e, ne.f20330e, le.f20279e, em.f20083e, kl.f20266e, ob.f20376e, zq.f21023e, e9.f20076e, c9.f19777e, a9.f19660e, ho.f20193e, nj.f20331e, j6.f20230e, hr.f20196e, mb.f20309e, zt.f21026e, ht.f20198e, qt.f20441e, st.f20539e, wt.f20653e, mt.f20319e, kt.f20269e, sl.f20537e, q8.f20426e, jo.f20235e, ig.f20214e, r0.f20446e, vv.f20632e, xv.f20677e, tv.f20586e, n2.f20323e, p2.f20394e, gz.f20172e, hu.f20199e, kz.f20271e, vw.f20633e, tw.f20587e, iz.f20225e, ez.f20086e, c00.f19767e, dt.f20061e, bt.f19760e, hj.f20192e, il.f20218e, v3.f20610e, t3.f20570e, pr.f20407e, rx.f20471e, fo.f20138e, c0.f19766e, a0.f19654e, e0.f20067e, xp.f20672e, qm.f20437e, fc.f20129e, hc.f20183e, lc.f20278e, vx.f20634e, xx.f20679e, hp.f20194e, ro.f20464e, lo.f20282e, xo.f20671e, rp.f20465e, jp.f20236e, po.f20404e, no.f20333e, zo.f21021e, np.f20334e, yh.f20691e, ai.f19679e, g0.f20149e, m0.f20291e, i0.f20204e, k0.f20248e, fp.f20139e, pp.f20405e, lp.f20283e, tp.f20581e, to.f20580e, bp.f19756e, dp.f20057e, vo.f20626e, sb.f20479e, s10.f20473e, yf.f20689e, ag.f19677e, cg.f19780e, ea.f20077e, qa.f20428e, m9.f20307e, oa.f20375e, w9.f20640e, y9.f20685e, s9.f20477e, ca.f19778e, aa.f19661e, q9.f20427e, u9.f20594e, ma.f20308e, ka.f20256e, ia.f20211e, o9.f20374e, sa.f20478e, ua.f20595e, ga.f20156e, r3.f20449e, db.f20051e, i00.f20205e, h6.f20177e, ub.f20596e, fx.f20147e, wm.f20652e};

    public static rc a(int i14, int i15) {
        for (int i16 = 0; i16 < 489; i16++) {
            bk bkVar = f20642a[i16];
            if (bkVar.f19751a == i14) {
                return new rc(bkVar.g(i15));
            }
        }
        return new rc(PrivacyUpdateRequestError.UNKNOWN, i15, 0, 1.0d, 0.0d, "", false, zn.ENUM);
    }

    public static bk b(int i14) {
        for (int i15 = 0; i15 < 489; i15++) {
            bk bkVar = f20642a[i15];
            if (bkVar.f19751a == i14) {
                return new bk(bkVar);
            }
        }
        return new bk(PrivacyUpdateRequestError.UNKNOWN, i14);
    }

    public static bk c(bk bkVar) {
        switch (bkVar.f19751a) {
            case 0:
                return new id(bkVar);
            case 1:
                return new b5(bkVar);
            case 2:
                return new s7(bkVar);
            case 3:
                return new e00(bkVar);
            case 4:
                return new sg(bkVar);
            case 5:
                return new nr(bkVar);
            case 6:
                return new x2(bkVar);
            case 7:
                return new w20(bkVar);
            case 8:
                return new mg(bkVar);
            case 9:
                return new tn(bkVar);
            case 10:
                return new mk(bkVar);
            case 11:
                return new c7(bkVar);
            case 12:
                return new pv(bkVar);
            case 13:
                return new wy(bkVar);
            case 14:
                return new qy(bkVar);
            case 15:
                return new te(bkVar);
            case 16:
                return new gy(bkVar);
            case 17:
                return new yy(bkVar);
            case 18:
                return new fs(bkVar);
            case 19:
                return new ti(bkVar);
            case 20:
                return new zp(bkVar);
            case 21:
                return new bb(bkVar);
            case 22:
                return new ju(bkVar);
            case 23:
                return new o7(bkVar);
            case 24:
                return new r6(bkVar);
            case 25:
            case 54:
            case 56:
            case 84:
            case 87:
            case 94:
            case 96:
            case 97:
            case 98:
            case 121:
            case 122:
            case 123:
            case 124:
            case 154:
            case ModuleDescriptor.MODULE_VERSION /* 155 */:
            case 156:
            case 157:
            case 226:
            case 260:
            case 328:
            case 343:
            case 347:
            default:
                return new bk(PrivacyUpdateRequestError.UNKNOWN, ik.f20217a);
            case 26:
                return new q20(bkVar);
            case 27:
                return new u20(bkVar);
            case 28:
                return new dr(bkVar);
            case 29:
                return new bj(bkVar);
            case 30:
                return new g20(bkVar);
            case 31:
                return new z5(bkVar);
            case 32:
                return new b6(bkVar);
            case 33:
                return new zx(bkVar);
            case 34:
                return new t(bkVar);
            case 35:
                return new du(bkVar);
            case 36:
                return new lr(bkVar);
            case 37:
                return new bd(bkVar);
            case 38:
                return new dk(bkVar);
            case 39:
                return new tc(bkVar);
            case 40:
                return new s8(bkVar);
            case 41:
                return new x6(bkVar);
            case 42:
                return new p6(bkVar);
            case 43:
                return new ii(bkVar);
            case 44:
                return new gi(bkVar);
            case 45:
                return new nw(bkVar);
            case 46:
                return new v6(bkVar);
            case 47:
                return new og(bkVar);
            case 48:
                return new qg(bkVar);
            case 49:
                return new dd(bkVar);
            case 50:
                return new t2(bkVar);
            case 51:
                return new p3(bkVar);
            case 52:
                return new t6(bkVar);
            case 53:
                return new lu(bkVar);
            case 55:
                return new yk(bkVar);
            case 57:
                return new r(bkVar);
            case 58:
                return new jr(bkVar);
            case 59:
                return new ds(bkVar);
            case 60:
                return new hs(bkVar);
            case 61:
                return new uz(bkVar);
            case 62:
                return new de(bkVar);
            case 63:
                return new be(bkVar);
            case 64:
                return new zd(bkVar);
            case 65:
                return new fe(bkVar);
            case 66:
                return new wz(bkVar);
            case 67:
                return new a00(bkVar);
            case 68:
                return new oz(bkVar);
            case 69:
                return new yz(bkVar);
            case 70:
                return new lj(bkVar);
            case 71:
                return new pq(bkVar);
            case 72:
                return new iy(bkVar);
            case 73:
                return new n6(bkVar);
            case 74:
                return new my(bkVar);
            case 75:
                return new sz(bkVar);
            case 76:
                return new mz(bkVar);
            case 77:
                return new qz(bkVar);
            case 78:
                return new ug(bkVar);
            case 79:
                return new od(bkVar);
            case 80:
                return new z0(bkVar);
            case 81:
                return new d1(bkVar);
            case 82:
                return new t0(bkVar);
            case 83:
                return new v(bkVar);
            case 85:
                return new c(bkVar);
            case 86:
                return new bw(bkVar);
            case 88:
                return new zv(bkVar);
            case 89:
                return new xw(bkVar);
            case 90:
                return new vu(bkVar);
            case 91:
                return new nu(bkVar);
            case 92:
                return new tu(bkVar);
            case 93:
                return new zu(bkVar);
            case 95:
                return new pu(bkVar);
            case 99:
                return new mf(bkVar);
            case 100:
                return new kf(bkVar);
            case 101:
                return new vi(bkVar);
            case 102:
                return new w00(bkVar);
            case 103:
                return new wk(bkVar);
            case 104:
                return new h2(bkVar);
            case 105:
                return new wm(bkVar);
            case 106:
                return new ft(bkVar);
            case 107:
                return new e4(bkVar);
            case 108:
                return new a4(bkVar);
            case 109:
                return new ru(bkVar);
            case 110:
                return new xu(bkVar);
            case 111:
                return new u00(bkVar);
            case 112:
                return new dv(bkVar);
            case 113:
                return new vn(bkVar);
            case 114:
                return new en(bkVar);
            case 115:
                return new k4(bkVar);
            case 116:
                return new i4(bkVar);
            case 117:
                return new m(bkVar);
            case 118:
                return new g(bkVar);
            case 119:
                return new lx(bkVar);
            case 120:
                return new g4(bkVar);
            case 125:
                return new z6(bkVar);
            case 126:
                return new br(bkVar);
            case 127:
                return new v5(bkVar);
            case 128:
                return new a20(bkVar);
            case 129:
                return new y10(bkVar);
            case 130:
                return new he(bkVar);
            case 131:
                return new r4(bkVar);
            case 132:
                return new kg(bkVar);
            case 133:
                return new d6(bkVar);
            case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO /* 134 */:
                return new f6(bkVar);
            case TsExtractor.TS_STREAM_TYPE_E_AC3 /* 135 */:
                return new c4(bkVar);
            case SyslogConstants.LOG_LOCAL1 /* 136 */:
                return new bv(bkVar);
            case 137:
                return new sy(bkVar);
            case TsExtractor.TS_STREAM_TYPE_DTS /* 138 */:
                return new fd(bkVar);
            case 139:
                return new xi(bkVar);
            case 140:
                return new qd(bkVar);
            case 141:
                return new cf(bkVar);
            case 142:
                return new vr(bkVar);
            case 143:
                return new gl(bkVar);
            case SyslogConstants.LOG_LOCAL2 /* 144 */:
                return new el(bkVar);
            case 145:
                return new tj(bkVar);
            case 146:
                return new y00(bkVar);
            case 147:
                return new bs(bkVar);
            case 148:
                return new tr(bkVar);
            case 149:
                return new xr(bkVar);
            case 150:
                return new zr(bkVar);
            case 151:
                return new rr(bkVar);
            case SyslogConstants.LOG_LOCAL3 /* 152 */:
                return new qk(bkVar);
            case 153:
                return new s00(bkVar);
            case 158:
                return new s20(bkVar);
            case 159:
                return new w10(bkVar);
            case SyslogConstants.LOG_LOCAL4 /* 160 */:
                return new ef(bkVar);
            case 161:
                return new v4(bkVar);
            case 162:
                return new tx(bkVar);
            case 163:
                return new a10(bkVar);
            case 164:
                return new uf(bkVar);
            case 165:
                return new o(bkVar);
            case 166:
                return new b1(bkVar);
            case 167:
                return new nx(bkVar);
            case 168:
                return new vj(bkVar);
            case 169:
                return new i10(bkVar);
            case 170:
                return new t5(bkVar);
            case 171:
                return new zw(bkVar);
            case TsExtractor.TS_STREAM_TYPE_AC4 /* 172 */:
                return new bx(bkVar);
            case 173:
                return new n5(bkVar);
            case 174:
                return new im(bkVar);
            case 175:
                return new rq(bkVar);
            case SyslogConstants.LOG_LOCAL6 /* 176 */:
                return new td(bkVar);
            case 177:
                return new gm(bkVar);
            case 178:
                return new r1(bkVar);
            case 179:
                return new f3(bkVar);
            case 180:
                return new h3(bkVar);
            case 181:
                return new j3(bkVar);
            case 182:
                return new zj(bkVar);
            case 183:
                return new xj(bkVar);
            case SyslogConstants.LOG_LOCAL7 /* 184 */:
                return new m10(bkVar);
            case 185:
                return new q10(bkVar);
            case 186:
                return new g10(bkVar);
            case 187:
                return new e10(bkVar);
            case TsExtractor.TS_PACKET_SIZE /* 188 */:
                return new km(bkVar);
            case PsExtractor.PRIVATE_STREAM_1 /* 189 */:
                return new kd(bkVar);
            case 190:
                return new lq(bkVar);
            case 191:
                return new nq(bkVar);
            case 192:
                return new jn(bkVar);
            case 193:
                return new x5(bkVar);
            case 194:
                return new ts(bkVar);
            case 195:
                return new ei(bkVar);
            case 196:
                return new vd(bkVar);
            case 197:
                return new t4(bkVar);
            case 198:
                return new az(bkVar);
            case 199:
                return new k20(bkVar);
            case 200:
                return new kb(bkVar);
            case 201:
                return new ib(bkVar);
            case 202:
                return new gb(bkVar);
            case MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE /* 203 */:
                return new d3(bkVar);
            case MlKitException.CODE_SCANNER_TASK_IN_PROGRESS /* 204 */:
                return new o20(bkVar);
            case MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR /* 205 */:
                return new m20(bkVar);
            case MlKitException.CODE_SCANNER_PIPELINE_INFERENCE_ERROR /* 206 */:
                return new yc(bkVar);
            case MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD /* 207 */:
                return new e7(bkVar);
            case 208:
                return new dj(bkVar);
            case 209:
                return new x1(bkVar);
            case 210:
                return new om(bkVar);
            case 211:
                return new uk(bkVar);
            case 212:
                return new b3(bkVar);
            case 213:
                return new v2(bkVar);
            case 214:
                return new z2(bkVar);
            case 215:
                return new j2(bkVar);
            case 216:
                return new px(bkVar);
            case 217:
                return new os(bkVar);
            case 218:
                return new o10(bkVar);
            case 219:
                return new z4(bkVar);
            case 220:
                return new mi(bkVar);
            case 221:
                return new ki(bkVar);
            case 222:
                return new p0(bkVar);
            case 223:
                return new i8(bkVar);
            case 224:
                return new o8(bkVar);
            case 225:
                return new ks(bkVar);
            case 227:
                return new lw(bkVar);
            case 228:
                return new fj(bkVar);
            case 229:
                return new pj(bkVar);
            case 230:
                return new c10(bkVar);
            case 231:
                return new ul(bkVar);
            case 232:
                return new ky(bkVar);
            case 233:
                return new i20(bkVar);
            case 234:
                return new hq(bkVar);
            case 235:
                return new f2(bkVar);
            case 236:
                return new z1(bkVar);
            case 237:
                return new b2(bkVar);
            case 238:
                return new d2(bkVar);
            case 239:
                return new jj(bkVar);
            case PsExtractor.VIDEO_STREAM_MASK /* 240 */:
                return new v1(bkVar);
            case 241:
                return new ok(bkVar);
            case 242:
                return new ol(bkVar);
            case 243:
                return new cm(bkVar);
            case 244:
                return new ml(bkVar);
            case 245:
                return new n3(bkVar);
            case 246:
                return new l3(bkVar);
            case 247:
                return new jw(bkVar);
            case 248:
                return new hw(bkVar);
            case 249:
                return new fw(bkVar);
            case 250:
                return new k(bkVar);
            case 251:
                return new i(bkVar);
            case 252:
                return new e(bkVar);
            case 253:
                return new m8(bkVar);
            case 254:
                return new ym(bkVar);
            case 255:
                return new m00(bkVar);
            case 256:
                return new o00(bkVar);
            case TsExtractor.TS_STREAM_TYPE_AIT /* 257 */:
                return new k00(bkVar);
            case 258:
                return new e8(bkVar);
            case 259:
                return new a8(bkVar);
            case 261:
                return new wl(bkVar);
            case 262:
                return new w7(bkVar);
            case 263:
                return new m7(bkVar);
            case 264:
                return new qb(bkVar);
            case 265:
                return new p1(bkVar);
            case 266:
                return new n1(bkVar);
            case 267:
                return new fr(bkVar);
            case 268:
                return new g8(bkVar);
            case 269:
                return new lv(bkVar);
            case 270:
                return new d5(bkVar);
            case 271:
                return new f5(bkVar);
            case 272:
                return new x4(bkVar);
            case 273:
                return new am(bkVar);
            case 274:
                return new yl(bkVar);
            case 275:
                return new ot(bkVar);
            case 276:
                return new g9(bkVar);
            case 277:
                return new q00(bkVar);
            case 278:
                return new bu(bkVar);
            case 279:
                return new sk(bkVar);
            case 280:
                return new ln(bkVar);
            case 281:
                return new wf(bkVar);
            case 282:
                return new zi(bkVar);
            case 283:
                return new k8(bkVar);
            case 284:
                return new bq(bkVar);
            case 285:
                return new qi(bkVar);
            case 286:
                return new jq(bkVar);
            case 287:
                return new x0(bkVar);
            case 288:
                return new md(bkVar);
            case 289:
                return new a(bkVar);
            case 290:
                return new r2(bkVar);
            case 291:
                return new dx(bkVar);
            case 292:
                return new ql(bkVar);
            case 293:
                return new an(bkVar);
            case 294:
                return new ey(bkVar);
            case 295:
                return new ms(bkVar);
            case 296:
                return new rv(bkVar);
            case 297:
                return new dq(bkVar);
            case 298:
                return new fq(bkVar);
            case 299:
                return new sf(bkVar);
            case 300:
                return new rs(bkVar);
            case MlKitException.LOW_LIGHT_IMAGE_CAPTURE_PROCESSING_FAILURE /* 301 */:
                return new zs(bkVar);
            case 302:
                return new ah(bkVar);
            case 303:
                return new mh(bkVar);
            case 304:
                return new sh(bkVar);
            case 305:
                return new qh(bkVar);
            case 306:
                return new uh(bkVar);
            case StatusLine.HTTP_TEMP_REDIRECT /* 307 */:
                return new oh(bkVar);
            case StatusLine.HTTP_PERM_REDIRECT /* 308 */:
                return new kh(bkVar);
            case 309:
                return new cl(bkVar);
            case 310:
                return new sm(bkVar);
            case 311:
                return new um(bkVar);
            case 312:
                return new fv(bkVar);
            case 313:
                return new jv(bkVar);
            case 314:
                return new ch(bkVar);
            case 315:
                return new gh(bkVar);
            case 316:
                return new hf(bkVar);
            case 317:
                return new l5(bkVar);
            case 318:
                return new fu(bkVar);
            case 319:
                return new jx(bkVar);
            case 320:
                return new rj(bkVar);
            case 321:
                return new rn(bkVar);
            case 322:
                return new p5(bkVar);
            case 323:
                return new hx(bkVar);
            case 324:
                return new v0(bkVar);
            case 325:
                return new re(bkVar);
            case 326:
                return new pe(bkVar);
            case 327:
                return new je(bkVar);
            case 329:
                return new ne(bkVar);
            case 330:
                return new em(bkVar);
            case 331:
                return new gn(bkVar);
            case 332:
                return new co(bkVar);
            case 333:
                return new kl(bkVar);
            case 334:
                return new ob(bkVar);
            case 335:
                return new zq(bkVar);
            case 336:
                return new e9(bkVar);
            case 337:
                return new c9(bkVar);
            case 338:
                return new a9(bkVar);
            case 339:
                return new ho(bkVar);
            case 340:
                return new nj(bkVar);
            case 341:
                return new j6(bkVar);
            case 342:
                return new hr(bkVar);
            case 344:
                return new mb(bkVar);
            case 345:
                return new zt(bkVar);
            case 346:
                return new ht(bkVar);
            case 348:
                return new q8(bkVar);
            case 349:
                return new w8(bkVar);
            case 350:
                return new y8(bkVar);
            case 351:
                return new jo(bkVar);
            case 352:
                return new nn(bkVar);
            case 353:
                return new pn(bkVar);
            case 354:
                return new ig(bkVar);
            case 355:
                return new r0(bkVar);
            case 356:
                return new cn(bkVar);
            case 357:
                return new dw(bkVar);
            case 358:
                return new vv(bkVar);
            case 359:
                return new xv(bkVar);
            case 360:
                return new n2(bkVar);
            case 361:
                return new p2(bkVar);
            case 362:
                return new gz(bkVar);
            case 363:
                return new hu(bkVar);
            case 364:
                return new kz(bkVar);
            case 365:
                return new iz(bkVar);
            case 366:
                return new ez(bkVar);
            case 367:
                return new u8(bkVar);
            case 368:
                return new cz(bkVar);
            case 369:
                return new uy(bkVar);
            case 370:
                return new wg(bkVar);
            case 371:
                return new yg(bkVar);
            case 372:
                return new vp(bkVar);
            case 373:
                return new al(bkVar);
            case 374:
                return new u10(bkVar);
            case 375:
                return new k7(bkVar);
            case 376:
                return new ih(bkVar);
            case 377:
                return new xd(bkVar);
            case 378:
                return new y(bkVar);
            case 379:
                return new ut(bkVar);
            case 380:
                return new ci(bkVar);
            case 381:
                return new xn(bkVar);
            case 382:
                return new st(bkVar);
            case 383:
                return new bc(bkVar);
            case 384:
                return new zb(bkVar);
            case 385:
                return new pc(bkVar);
            case 386:
                return new jc(bkVar);
            case 387:
                return new j5(bkVar);
            case 388:
                return new h5(bkVar);
            case 389:
                return new eh(bkVar);
            case 390:
                return new dc(bkVar);
            case 391:
                return new nc(bkVar);
            case 392:
                return new oi(bkVar);
            case 393:
                return new y7(bkVar);
            case 394:
                return new af(bkVar);
            case 395:
                return new hv(bkVar);
            case 396:
                return new k10(bkVar);
            case 397:
                return new dt(bkVar);
            case 398:
                return new bt(bkVar);
            case 399:
                return new hj(bkVar);
            case 400:
                return new l2(bkVar);
            case INVALID_HTTP_HEADER_FIELDS_IN_NETWORK_RESPONSE_VALUE:
                return new gg(bkVar);
            case 402:
                return new eg(bkVar);
            case 403:
                return new k9(bkVar);
            case WalletConstants.ERROR_CODE_INVALID_PARAMETERS /* 404 */:
                return new i9(bkVar);
            case WalletConstants.ERROR_CODE_MERCHANT_ACCOUNT_ERROR /* 405 */:
                return new r5(bkVar);
            case WalletConstants.ERROR_CODE_SPENDING_LIMIT_EXCEEDED /* 406 */:
                return new il(bkVar);
            case 407:
                return new v3(bkVar);
            case 408:
                return new t3(bkVar);
            case WalletConstants.ERROR_CODE_BUYER_ACCOUNT_ERROR /* 409 */:
                return new wh(bkVar);
            case WalletConstants.ERROR_CODE_INVALID_TRANSACTION /* 410 */:
                return new qt(bkVar);
            case WalletConstants.ERROR_CODE_AUTHENTICATION_FAILURE /* 411 */:
                return new wt(bkVar);
            case WalletConstants.ERROR_CODE_UNSUPPORTED_API_VERSION /* 412 */:
                return new sl(bkVar);
            case WalletConstants.ERROR_CODE_UNKNOWN /* 413 */:
                return new xb(bkVar);
            case 414:
                return new c00(bkVar);
            case 415:
                return new q7(bkVar);
            case 416:
                return new ye(bkVar);
            case 417:
                return new we(bkVar);
            case 418:
                return new c8(bkVar);
            case 419:
                return new mm(bkVar);
            case 420:
                return new of(bkVar);
            case StatusLine.HTTP_MISDIRECTED_REQUEST /* 421 */:
                return new pr(bkVar);
            case 422:
                return new cy(bkVar);
            case 423:
                return new rx(bkVar);
            case 424:
                return new vw(bkVar);
            case 425:
                return new fo(bkVar);
            case 426:
                return new c0(bkVar);
            case 427:
                return new a0(bkVar);
            case 428:
                return new e0(bkVar);
            case 429:
                return new xp(bkVar);
            case 430:
                return new fc(bkVar);
            case 431:
                return new hc(bkVar);
            case 432:
                return new u7(bkVar);
            case 433:
                return new qf(bkVar);
            case 434:
                return new vx(bkVar);
            case 435:
                return new xx(bkVar);
            case 436:
                return new ya(bkVar);
            case 437:
                return new hp(bkVar);
            case 438:
                return new ro(bkVar);
            case 439:
                return new lo(bkVar);
            case 440:
                return new xo(bkVar);
            case 441:
                return new rp(bkVar);
            case 442:
                return new jp(bkVar);
            case 443:
                return new no(bkVar);
            case 444:
                return new zo(bkVar);
            case 445:
                return new fp(bkVar);
            case 446:
                return new pp(bkVar);
            case 447:
                return new yh(bkVar);
            case 448:
                return new ai(bkVar);
            case 449:
                return new g0(bkVar);
            case 450:
                return new i0(bkVar);
            case 451:
                return new k0(bkVar);
            case 452:
                return new lp(bkVar);
            case 453:
                return new m0(bkVar);
            case 454:
                return new po(bkVar);
            case 455:
                return new np(bkVar);
            case 456:
                return new tp(bkVar);
            case 457:
                return new to(bkVar);
            case 458:
                return new bp(bkVar);
            case 459:
                return new dp(bkVar);
            case 460:
                return new vo(bkVar);
            case 461:
                return new tv(bkVar);
            case 462:
                return new sb(bkVar);
            case 463:
                return new oy(bkVar);
            case 464:
                return new x3(bkVar);
            case 465:
                return new tw(bkVar);
            case 466:
                return new s10(bkVar);
            case 467:
                return new qw(bkVar);
            case 468:
                return new yf(bkVar);
            case 469:
                return new ag(bkVar);
            case 470:
                return new mt(bkVar);
            case 471:
                return new kt(bkVar);
            case 472:
                return new l1(bkVar);
            case 473:
                return new xq(bkVar);
            case 474:
                return new ea(bkVar);
            case 475:
                return new qa(bkVar);
            case 476:
                return new m9(bkVar);
            case 477:
                return new oa(bkVar);
            case 478:
                return new w9(bkVar);
            case 479:
                return new y9(bkVar);
            case 480:
                return new s9(bkVar);
            case 481:
                return new ca(bkVar);
            case 482:
                return new aa(bkVar);
            case 483:
                return new q9(bkVar);
            case 484:
                return new r3(bkVar);
            case 485:
                return new j1(bkVar);
            case 486:
                return new vq(bkVar);
            case 487:
                return new xs(bkVar);
            case 488:
                return new u9(bkVar);
            case 489:
                return new db(bkVar);
            case 490:
                return new vs(bkVar);
            case 491:
                return new i00(bkVar);
            case 492:
                return new ia(bkVar);
            case 493:
                return new wa(bkVar);
            case 494:
                return new h6(bkVar);
            case 495:
                return new cg(bkVar);
            case 496:
                return new tq(bkVar);
            case 497:
                return new ma(bkVar);
            case 498:
                return new ka(bkVar);
            case 499:
                return new le(bkVar);
            case 500:
                return new h1(bkVar);
            case 501:
                return new f1(bkVar);
            case 502:
                return new ub(bkVar);
            case 503:
                return new t1(bkVar);
            case 504:
                return new o9(bkVar);
            case 505:
                return new fx(bkVar);
            case 506:
                return new qm(bkVar);
            case 507:
                return new lc(bkVar);
            case 508:
                return new sa(bkVar);
            case 509:
                return new ua(bkVar);
            case 510:
                return new ga(bkVar);
        }
    }
}
