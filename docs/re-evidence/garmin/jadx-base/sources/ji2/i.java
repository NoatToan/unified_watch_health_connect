package ji2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lji2/i;", "", "<init>", "()V", "a", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f98859a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final hi2.d f98860b = new hi2.d("DSL-DataLoaderFactory", null, 2, null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lji2/i$a;", "", "<init>", "()V", "Lhi2/d;", "logger", "Lhi2/d;", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static h a(li2.d dVar, li2.a aVar, String str) {
            str.getClass();
            hi2.d dVar2 = i.f98860b;
            dVar2.getClass();
            if (str.equals(ni2.b.CONTROLS_MENU_RESET.f126214a)) {
                return new ji2.a(dVar, aVar);
            }
            if (str.equals(ni2.b.RTS_WALK_STRIDE_LENGTH.f126214a) ? true : str.equals(ni2.b.CUSTOM_STRIDE.f126214a)) {
                return new c(dVar, aVar);
            }
            if (str.equals(ni2.b.ACTIVITIES.f126214a) ? true : str.equals(ni2.b.ACTIVITY_OPTIONS.f126214a) ? true : str.equals(ni2.b.ACTIVITY_TRACKING.f126214a) ? true : str.equals(ni2.b.APPEARANCE.f126214a) ? true : str.equals(ni2.b.GENERAL.f126214a) ? true : str.equals(ni2.b.RTS_GOALS_DAILY_STEPS.f126214a) ? true : str.equals(ni2.b.RTS_GOALS_FLOORS.f126214a) ? true : str.equals(ni2.b.RTS_GOALS_WEEKLY_INTENSITY.f126214a) ? true : str.equals(ni2.b.SOUND_AND_ALERTS.f126214a) ? true : str.equals(ni2.b.DEVICE.f126214a)) {
                return new j(dVar, aVar);
            }
            if (str.equals(ni2.b.USER.f126214a) ? true : str.equals(ni2.b.DEVICE_USER.f126214a)) {
                return new a0(dVar, null, 2, null);
            }
            dVar2.b("getDataLoader: Could not find data loader " + str + ".");
            return null;
        }

        public static String b(String str) {
            str.getClass();
            hi2.d dVar = i.f98860b;
            dVar.getClass();
            ni2.b bVar = ni2.b.CONTROLS_MENU_RESET;
            if (str.equals(bVar.f126214a)) {
                return bVar.f126215b;
            }
            ni2.b bVar2 = ni2.b.CUSTOM_STRIDE;
            if (str.equals(bVar2.f126214a)) {
                return bVar2.f126215b;
            }
            ni2.b bVar3 = ni2.b.ACTIVITIES;
            if (str.equals(bVar3.f126214a)) {
                return bVar3.f126215b;
            }
            ni2.b bVar4 = ni2.b.ACTIVITY_OPTIONS;
            if (str.equals(bVar4.f126214a)) {
                return bVar4.f126215b;
            }
            ni2.b bVar5 = ni2.b.ACTIVITY_TRACKING;
            if (str.equals(bVar5.f126214a)) {
                return bVar5.f126215b;
            }
            ni2.b bVar6 = ni2.b.APPEARANCE;
            if (str.equals(bVar6.f126214a)) {
                return bVar6.f126215b;
            }
            ni2.b bVar7 = ni2.b.DEVICE;
            if (str.equals(bVar7.f126214a)) {
                return bVar7.f126215b;
            }
            ni2.b bVar8 = ni2.b.GENERAL;
            if (str.equals(bVar8.f126214a)) {
                return bVar8.f126215b;
            }
            ni2.b bVar9 = ni2.b.RTS_WALK_STRIDE_LENGTH;
            if (str.equals(bVar9.f126214a)) {
                return bVar9.f126215b;
            }
            ni2.b bVar10 = ni2.b.RTS_GOALS_DAILY_STEPS;
            if (str.equals(bVar10.f126214a)) {
                return bVar10.f126215b;
            }
            ni2.b bVar11 = ni2.b.RTS_GOALS_FLOORS;
            if (str.equals(bVar11.f126214a)) {
                return bVar11.f126215b;
            }
            ni2.b bVar12 = ni2.b.RTS_GOALS_WEEKLY_INTENSITY;
            if (str.equals(bVar12.f126214a)) {
                return bVar12.f126215b;
            }
            ni2.b bVar13 = ni2.b.SOUND_AND_ALERTS;
            if (str.equals(bVar13.f126214a)) {
                return bVar13.f126215b;
            }
            ni2.b bVar14 = ni2.b.DEVICE_USER;
            if (str.equals(bVar14.f126214a)) {
                return bVar14.f126215b;
            }
            ni2.b bVar15 = ni2.b.USER;
            if (str.equals(bVar15.f126214a)) {
                return bVar15.f126215b;
            }
            dVar.b("getParentDataLoaderType: Could not find parent loader type " + str + ".");
            return null;
        }

        private a() {
        }
    }
}
