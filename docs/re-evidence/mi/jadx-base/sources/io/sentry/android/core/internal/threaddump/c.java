package io.sentry.android.core.internal.threaddump;

import com.xiaomi.fitness.watch.face.schema.FaceSchema;
import defpackage.tvl;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.protocol.u;
import io.sentry.protocol.v;
import io.sentry.t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class c {
    public static final Pattern d = Pattern.compile("\"(.*)\" (.*) ?prio=(\\d+)\\s+tid=(\\d+)\\s*(.*)");
    public static final Pattern e = Pattern.compile("\"(.*)\" (.*) ?sysTid=(\\d+)");
    public static final Pattern f = Pattern.compile(" *(?:native: )?#\\d+ \\S+ [0-9a-fA-F]+\\s+(.*?)\\s+\\((.*)\\+(\\d+)\\)(?: \\(.*\\))?");
    public static final Pattern g = Pattern.compile(" *(?:native: )?#\\d+ \\S+ [0-9a-fA-F]+\\s+(.*)\\s*\\(?(.*)\\)?(?: \\(.*\\))?");
    public static final Pattern h = Pattern.compile(" *at (?:(.+)\\.)?([^.]+)\\.([^.]+)\\((.*):([\\d-]+)\\)");
    public static final Pattern i = Pattern.compile(" *at (?:(.+)\\.)?([^.]+)\\.([^.]+)\\(Native method\\)");
    public static final Pattern j = Pattern.compile(" *- locked \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Pattern f21498k = Pattern.compile(" *- sleeping on \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");
    public static final Pattern l = Pattern.compile(" *- waiting on \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");
    public static final Pattern m = Pattern.compile(" *- waiting to lock \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");
    public static final Pattern n = Pattern.compile(" *- waiting to lock \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)(?: held by thread (\\d+))");
    public static final Pattern o = Pattern.compile(" *- waiting to lock an unknown object");
    public static final Pattern p = Pattern.compile("\\s+");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SentryOptions f21499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f21500b;

    @NotNull
    public final tvl c;

    public c(@NotNull SentryOptions sentryOptions, boolean z) {
        this.f21499a = sentryOptions;
        this.f21500b = z;
        this.c = new tvl(sentryOptions);
    }

    public final void a(@NotNull v vVar, @NotNull t tVar) {
        Map<String, t> mapK = vVar.k();
        if (mapK == null) {
            mapK = new HashMap<>();
        }
        t tVar2 = mapK.get(tVar.f());
        if (tVar2 != null) {
            tVar2.l(Math.max(tVar2.g(), tVar.g()));
        } else {
            mapK.put(tVar.f(), new t(tVar));
        }
        vVar.t(mapK);
    }

    @Nullable
    public final Integer b(@NotNull Matcher matcher, int i2, @Nullable Integer num) {
        String strGroup = matcher.group(i2);
        return (strGroup == null || strGroup.length() == 0) ? num : Integer.valueOf(Integer.parseInt(strGroup));
    }

    @Nullable
    public final Long c(@NotNull Matcher matcher, int i2, @Nullable Long l2) {
        String strGroup = matcher.group(i2);
        return (strGroup == null || strGroup.length() == 0) ? l2 : Long.valueOf(Long.parseLong(strGroup));
    }

    @Nullable
    public final Integer d(@NotNull Matcher matcher, int i2, @Nullable Integer num) {
        String strGroup = matcher.group(i2);
        if (strGroup == null || strGroup.length() == 0) {
            return num;
        }
        int i3 = Integer.parseInt(strGroup);
        return i3 >= 0 ? Integer.valueOf(i3) : num;
    }

    public final boolean e(@NotNull Matcher matcher, @NotNull String str) {
        matcher.reset(str);
        return matcher.matches();
    }

    @NotNull
    public List<v> f(@NotNull b bVar) {
        ArrayList arrayList = new ArrayList();
        Matcher matcher = d.matcher("");
        Matcher matcher2 = e.matcher("");
        while (bVar.a()) {
            a aVarB = bVar.b();
            if (aVarB == null) {
                this.f21499a.getLogger().c(SentryLevel.WARNING, "Internal error while parsing thread dump.", new Object[0]);
                return arrayList;
            }
            String str = aVarB.f21495b;
            if (e(matcher, str) || e(matcher2, str)) {
                bVar.d();
                v vVarH = h(bVar);
                if (vVarH != null) {
                    arrayList.add(vVarH);
                }
            }
        }
        return arrayList;
    }

    @NotNull
    public final u g(@NotNull b bVar, @NotNull v vVar) {
        Matcher matcher;
        ArrayList arrayList = new ArrayList();
        Matcher matcher2 = f.matcher("");
        Matcher matcher3 = g.matcher("");
        Matcher matcher4 = h.matcher("");
        Matcher matcher5 = i.matcher("");
        Matcher matcher6 = j.matcher("");
        Matcher matcher7 = l.matcher("");
        Matcher matcher8 = f21498k.matcher("");
        Matcher matcher9 = n.matcher("");
        Matcher matcher10 = m.matcher("");
        Matcher matcher11 = o.matcher("");
        Matcher matcher12 = p.matcher("");
        io.sentry.protocol.t tVar = null;
        while (bVar.a()) {
            a aVarB = bVar.b();
            if (aVarB == null) {
                this.f21499a.getLogger().c(SentryLevel.WARNING, "Internal error while parsing thread dump.", new Object[0]);
                break;
            }
            String str = aVarB.f21495b;
            Matcher matcher13 = matcher12;
            if (e(matcher2, str)) {
                io.sentry.protocol.t tVar2 = new io.sentry.protocol.t();
                tVar2.z(matcher2.group(1));
                tVar2.t(matcher2.group(2));
                tVar2.v(b(matcher2, 3, null));
                arrayList.add(tVar2);
            } else {
                if (e(matcher3, str)) {
                    io.sentry.protocol.t tVar3 = new io.sentry.protocol.t();
                    tVar3.z(matcher3.group(1));
                    tVar3.t(matcher3.group(2));
                    arrayList.add(tVar3);
                } else {
                    matcher = matcher2;
                    if (e(matcher4, str)) {
                        tVar = new io.sentry.protocol.t();
                        String str2 = String.format("%s.%s", matcher4.group(1), matcher4.group(2));
                        tVar.x(str2);
                        tVar.t(matcher4.group(3));
                        tVar.s(matcher4.group(4));
                        tVar.v(d(matcher4, 5, null));
                        tVar.u(this.c.b(str2));
                        arrayList.add(tVar);
                    } else if (e(matcher5, str)) {
                        tVar = new io.sentry.protocol.t();
                        String str3 = String.format("%s.%s", matcher5.group(1), matcher5.group(2));
                        tVar.x(str3);
                        tVar.t(matcher5.group(3));
                        tVar.u(this.c.b(str3));
                        arrayList.add(tVar);
                    } else if (e(matcher6, str)) {
                        if (tVar != null) {
                            t tVar4 = new t();
                            tVar4.l(1);
                            tVar4.h(matcher6.group(1));
                            tVar4.j(matcher6.group(2));
                            tVar4.i(matcher6.group(3));
                            tVar.w(tVar4);
                            a(vVar, tVar4);
                        }
                    } else if (e(matcher7, str)) {
                        if (tVar != null) {
                            t tVar5 = new t();
                            tVar5.l(2);
                            tVar5.h(matcher7.group(1));
                            tVar5.j(matcher7.group(2));
                            tVar5.i(matcher7.group(3));
                            tVar.w(tVar5);
                            a(vVar, tVar5);
                        }
                    } else if (!e(matcher8, str)) {
                        if (!e(matcher9, str)) {
                            if (!e(matcher10, str)) {
                                if (!e(matcher11, str)) {
                                    if (str.length() == 0) {
                                        break;
                                    }
                                    matcher12 = matcher13;
                                    if (e(matcher12, str)) {
                                        break;
                                    }
                                } else if (tVar != null) {
                                    t tVar6 = new t();
                                    tVar6.l(8);
                                    tVar.w(tVar6);
                                    a(vVar, tVar6);
                                }
                            } else if (tVar != null) {
                                t tVar7 = new t();
                                tVar7.l(8);
                                tVar7.h(matcher10.group(1));
                                tVar7.j(matcher10.group(2));
                                tVar7.i(matcher10.group(3));
                                tVar.w(tVar7);
                                a(vVar, tVar7);
                            }
                        } else if (tVar != null) {
                            t tVar8 = new t();
                            tVar8.l(8);
                            tVar8.h(matcher9.group(1));
                            tVar8.j(matcher9.group(2));
                            tVar8.i(matcher9.group(3));
                            tVar8.k(c(matcher9, 4, null));
                            tVar.w(tVar8);
                            a(vVar, tVar8);
                        }
                        matcher12 = matcher13;
                    } else if (tVar != null) {
                        t tVar9 = new t();
                        tVar9.l(4);
                        tVar9.h(matcher8.group(1));
                        tVar9.j(matcher8.group(2));
                        tVar9.i(matcher8.group(3));
                        tVar.w(tVar9);
                        a(vVar, tVar9);
                    }
                    matcher12 = matcher13;
                }
                matcher2 = matcher;
            }
            matcher = matcher2;
            matcher12 = matcher13;
            tVar = null;
            matcher2 = matcher;
        }
        Collections.reverse(arrayList);
        u uVar = new u(arrayList);
        uVar.e(Boolean.TRUE);
        return uVar;
    }

    public final v h(@NotNull b bVar) {
        v vVar = new v();
        Matcher matcher = d.matcher("");
        Matcher matcher2 = e.matcher("");
        if (!bVar.a()) {
            return null;
        }
        a aVarB = bVar.b();
        boolean z = false;
        if (aVarB == null) {
            this.f21499a.getLogger().c(SentryLevel.WARNING, "Internal error while parsing thread dump.", new Object[0]);
            return null;
        }
        if (e(matcher, aVarB.f21495b)) {
            Long lC = c(matcher, 4, null);
            if (lC == null) {
                this.f21499a.getLogger().c(SentryLevel.DEBUG, "No thread id in the dump, skipping thread.", new Object[0]);
                return null;
            }
            vVar.u(lC);
            vVar.w(matcher.group(1));
            String strGroup = matcher.group(5);
            if (strGroup != null) {
                if (strGroup.contains(" ")) {
                    vVar.z(strGroup.substring(0, strGroup.indexOf(32)));
                } else {
                    vVar.z(strGroup);
                }
            }
        } else if (e(matcher2, aVarB.f21495b)) {
            Long lC2 = c(matcher2, 3, null);
            if (lC2 == null) {
                this.f21499a.getLogger().c(SentryLevel.DEBUG, "No thread id in the dump, skipping thread.", new Object[0]);
                return null;
            }
            vVar.u(lC2);
            vVar.w(matcher2.group(1));
        }
        String strM = vVar.m();
        if (strM != null) {
            boolean zEquals = strM.equals(FaceSchema.FACE_PAGE_MAIN);
            vVar.v(Boolean.valueOf(zEquals));
            vVar.q(Boolean.valueOf(zEquals));
            if (zEquals && !this.f21500b) {
                z = true;
            }
            vVar.r(Boolean.valueOf(z));
        }
        vVar.y(g(bVar, vVar));
        return vVar;
    }
}
