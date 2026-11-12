package com.xiaomi.ai.api.intent.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.ai.api.intent.AIApiConstants;
import com.xiaomi.ai.api.intent.EntityType;
import com.xiaomi.ai.api.intent.IntentUtils;
import com.xiaomi.ai.api.intent.IntentionEntity;
import com.xiaomi.ai.api.intent.Slot;
import com.xiaomi.ai.api.intent.general;
import com.xiaomi.common.Optional;
import com.xiaomi.fitness.sport_manager.utils.SportUtilsKt;
import defpackage.c4h;
import defpackage.zsd;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes7.dex */
public class HomeScreen<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;

    public enum HomeScreenMode {
        Standard(1, "standard"),
        Drawer(2, "drawer");

        private int id;
        private String name;

        HomeScreenMode(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static HomeScreenMode find(String str) {
            for (HomeScreenMode homeScreenMode : values()) {
                if (homeScreenMode.name.equals(str)) {
                    return homeScreenMode;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static HomeScreenMode read(String str) {
            return find(str);
        }

        public static String write(HomeScreenMode homeScreenMode) {
            return homeScreenMode.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public enum Page {
        Mall(1, "Mall"),
        Child(2, "Child"),
        Mine(3, "Mine"),
        VIP(4, "VIP"),
        Show(5, "Show"),
        MiSchool(6, "MiSchool"),
        JiguangTV(7, "JiguangTV"),
        Sing(8, "Sing"),
        Knowledge(9, "Knowledge"),
        Sport(10, SportUtilsKt.TAG),
        Fitness(11, AIApiConstants.Fitness.NAME),
        Documentary(12, "Documentary"),
        Travel(13, "Travel"),
        Car(14, "Car"),
        App(15, AIApiConstants.App.NAME),
        Category(16, "Category"),
        Video(17, "Video"),
        Music(18, "Music"),
        Audiobook(19, "Audiobook"),
        SkillCenter(20, "SkillCenter");

        private int id;
        private String name;

        Page(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static Page find(String str) {
            for (Page page : values()) {
                if (page.name.equals(str)) {
                    return page;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static Page read(String str) {
            return find(str);
        }

        public static String write(Page page) {
            return page.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public static class iconSize implements EntityType {
        public static iconSize read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new iconSize();
        }

        public static c4h write(iconSize iconsize) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class mode implements EntityType {
        private Optional<Slot<HomeScreenMode>> mode = Optional.a();

        public static mode read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            mode modeVar = new mode();
            if (zsdVar.z("mode")) {
                modeVar.setMode(IntentUtils.readSlot(zsdVar.w("mode"), HomeScreenMode.class));
            }
            return modeVar;
        }

        public static c4h write(mode modeVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (modeVar.mode.c()) {
                c4hVarCreateObjectNode.f0("mode", IntentUtils.writeSlot(modeVar.mode.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<HomeScreenMode>> getMode() {
            return this.mode;
        }

        public mode setMode(Slot<HomeScreenMode> slot) {
            this.mode = Optional.e(slot);
            return this;
        }
    }

    public static class negativeScreen implements EntityType {
        public static negativeScreen read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new negativeScreen();
        }

        public static c4h write(negativeScreen negativescreen) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class searchBar implements EntityType {
        public static searchBar read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new searchBar();
        }

        public static c4h write(searchBar searchbar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class setting implements EntityType {
        public static setting read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new setting();
        }

        public static c4h write(setting settingVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class tabPage implements EntityType {
        private Optional<Slot<Page>> tabPage = Optional.a();

        public static tabPage read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            tabPage tabpage = new tabPage();
            if (zsdVar.z("tabPage")) {
                tabpage.setTabPage(IntentUtils.readSlot(zsdVar.w("tabPage"), Page.class));
            }
            return tabpage;
        }

        public static c4h write(tabPage tabpage) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (tabpage.tabPage.c()) {
                c4hVarCreateObjectNode.f0("tabPage", IntentUtils.writeSlot(tabpage.tabPage.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Page>> getTabPage() {
            return this.tabPage;
        }

        public tabPage setTabPage(Slot<Page> slot) {
            this.tabPage = Optional.e(slot);
            return this;
        }
    }

    public static class tool implements EntityType {
        public static tool read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new tool();
        }

        public static c4h write(tool toolVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public HomeScreen() {
    }

    public static HomeScreen read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        return new HomeScreen(IntentUtils.readEntityType(zsdVar, AIApiConstants.HomeScreen.NAME, optional));
    }

    public static zsd write(HomeScreen homeScreen) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        return (c4h) IntentUtils.writeEntityType(homeScreen.entity_type);
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    @Required
    public HomeScreen setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public HomeScreen(T t) {
        this.entity_type = t;
    }
}
