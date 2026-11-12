package com.xiaomi.ai.api.intent.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.ai.api.intent.AIApiConstants;
import com.xiaomi.ai.api.intent.DomainType;
import com.xiaomi.ai.api.intent.EntityType;
import com.xiaomi.ai.api.intent.IntentUtils;
import com.xiaomi.ai.api.intent.IntentionEntity;
import com.xiaomi.ai.api.intent.Slot;
import com.xiaomi.ai.api.intent.general;
import com.xiaomi.ai.api.intent.slots.Miai;
import com.xiaomi.common.Optional;
import com.xiaomi.fitness.feedback.util.FeedbackConstants;
import com.xiaomi.fitness.nfc.ui.realname.RealNameWebViewActivity;
import com.xiaomi.fitness.watch.face.FaceDetailFragment;
import defpackage.c4h;
import defpackage.zsd;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class App<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;

    @Required
    private Slot<List<AppInfo>> matched;
    private Optional<Slot<String>> name = Optional.a();
    private Optional<Slot<String>> type = Optional.a();
    private Optional<Slot<String>> keyword = Optional.a();
    private Optional<Slot<String>> category = Optional.a();
    private Optional<Slot<Miai.Age>> age = Optional.a();
    private Optional<Slot<Boolean>> force = Optional.a();
    private Optional<Slot<String>> version = Optional.a();

    public static class AppInfo implements DomainType {

        @Required
        private String iconUrl;

        @Required
        private boolean isNative;

        @Required
        private boolean isOnline;

        @Required
        private boolean isTop;

        @Required
        private String name;

        @Required
        private String packageName;

        @Required
        private double score;

        public AppInfo() {
        }

        public AppInfo(String str, String str2, String str3, boolean z, boolean z2, boolean z3, double d) {
            this.name = str;
            this.packageName = str2;
            this.iconUrl = str3;
            this.isNative = z;
            this.isOnline = z2;
            this.isTop = z3;
            this.score = d;
        }

        @Required
        public String getIconUrl() {
            return this.iconUrl;
        }

        @Required
        public String getName() {
            return this.name;
        }

        @Required
        public String getPackageName() {
            return this.packageName;
        }

        @Required
        public double getScore() {
            return this.score;
        }

        @Required
        public boolean isIsNative() {
            return this.isNative;
        }

        @Required
        public boolean isIsOnline() {
            return this.isOnline;
        }

        @Required
        public boolean isIsTop() {
            return this.isTop;
        }

        @Required
        public AppInfo setIconUrl(String str) {
            this.iconUrl = str;
            return this;
        }

        @Required
        public AppInfo setIsNative(boolean z) {
            this.isNative = z;
            return this;
        }

        @Required
        public AppInfo setIsOnline(boolean z) {
            this.isOnline = z;
            return this;
        }

        @Required
        public AppInfo setIsTop(boolean z) {
            this.isTop = z;
            return this;
        }

        @Required
        public AppInfo setName(String str) {
            this.name = str;
            return this;
        }

        @Required
        public AppInfo setPackageName(String str) {
            this.packageName = str;
            return this;
        }

        @Required
        public AppInfo setScore(double d) {
            this.score = d;
            return this;
        }
    }

    public static class attribute implements EntityType {

        @Required
        private Slot<String> name;

        public attribute() {
        }

        public attribute(Slot<String> slot) {
            this.name = slot;
        }

        public static attribute read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            attribute attributeVar = new attribute();
            attributeVar.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
            return attributeVar;
        }

        public static c4h write(attribute attributeVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(attributeVar.name));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<String> getName() {
            return this.name;
        }

        @Required
        public attribute setName(Slot<String> slot) {
            this.name = slot;
            return this;
        }
    }

    public static class code implements EntityType {

        @Required
        private Slot<String> name;

        public code() {
        }

        public code(Slot<String> slot) {
            this.name = slot;
        }

        public static code read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            code codeVar = new code();
            codeVar.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
            return codeVar;
        }

        public static c4h write(code codeVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(codeVar.name));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<String> getName() {
            return this.name;
        }

        @Required
        public code setName(Slot<String> slot) {
            this.name = slot;
            return this;
        }
    }

    public static class content implements EntityType {

        @Required
        private Slot<String> name;

        public content() {
        }

        public content(Slot<String> slot) {
            this.name = slot;
        }

        public static content read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            content contentVar = new content();
            contentVar.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
            return contentVar;
        }

        public static c4h write(content contentVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(contentVar.name));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<String> getName() {
            return this.name;
        }

        @Required
        public content setName(Slot<String> slot) {
            this.name = slot;
            return this;
        }
    }

    public static class creativeType implements EntityType {

        @Required
        private Slot<String> name;

        public creativeType() {
        }

        public creativeType(Slot<String> slot) {
            this.name = slot;
        }

        public static creativeType read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            creativeType creativetype = new creativeType();
            creativetype.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
            return creativetype;
        }

        public static c4h write(creativeType creativetype) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(creativetype.name));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<String> getName() {
            return this.name;
        }

        @Required
        public creativeType setName(Slot<String> slot) {
            this.name = slot;
            return this;
        }
    }

    public static class functions implements EntityType {

        @Required
        private Slot<String> name;

        public functions() {
        }

        public functions(Slot<String> slot) {
            this.name = slot;
        }

        public static functions read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            functions functionsVar = new functions();
            functionsVar.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
            return functionsVar;
        }

        public static c4h write(functions functionsVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(functionsVar.name));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<String> getName() {
            return this.name;
        }

        @Required
        public functions setName(Slot<String> slot) {
            this.name = slot;
            return this;
        }
    }

    public static class guide implements EntityType {
        public static guide read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new guide();
        }

        public static c4h write(guide guideVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class horizontalScreen implements EntityType {
        public static horizontalScreen read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new horizontalScreen();
        }

        public static c4h write(horizontalScreen horizontalscreen) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class miniProgram implements EntityType {

        @Required
        private Slot<String> name;

        public miniProgram() {
        }

        public miniProgram(Slot<String> slot) {
            this.name = slot;
        }

        public static miniProgram read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            miniProgram miniprogram = new miniProgram();
            miniprogram.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
            return miniprogram;
        }

        public static c4h write(miniProgram miniprogram) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(miniprogram.name));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<String> getName() {
            return this.name;
        }

        @Required
        public miniProgram setName(Slot<String> slot) {
            this.name = slot;
            return this;
        }
    }

    public static class money implements EntityType {
        private Optional<Slot<Double>> number = Optional.a();

        public static money read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            money moneyVar = new money();
            if (zsdVar.z(RealNameWebViewActivity.NUMBER)) {
                moneyVar.setNumber(IntentUtils.readSlot(zsdVar.w(RealNameWebViewActivity.NUMBER), Double.class));
            }
            return moneyVar;
        }

        public static c4h write(money moneyVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (moneyVar.number.c()) {
                c4hVarCreateObjectNode.f0(RealNameWebViewActivity.NUMBER, IntentUtils.writeSlot(moneyVar.number.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Double>> getNumber() {
            return this.number;
        }

        public money setNumber(Slot<Double> slot) {
            this.number = Optional.e(slot);
            return this;
        }
    }

    public static class page implements EntityType {

        @Required
        private Slot<String> app_name;

        @Required
        private Slot<String> page_name;

        public page() {
        }

        public page(Slot<String> slot, Slot<String> slot2) {
            this.app_name = slot;
            this.page_name = slot2;
        }

        public static page read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            page pageVar = new page();
            pageVar.setAppName(IntentUtils.readSlot(zsdVar.w(FeedbackConstants.KEY_APP_NAME), String.class));
            pageVar.setPageName(IntentUtils.readSlot(zsdVar.w(FaceDetailFragment.PAGE_NAME), String.class));
            return pageVar;
        }

        public static c4h write(page pageVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0(FeedbackConstants.KEY_APP_NAME, IntentUtils.writeSlot(pageVar.app_name));
            c4hVarCreateObjectNode.f0(FaceDetailFragment.PAGE_NAME, IntentUtils.writeSlot(pageVar.page_name));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<String> getAppName() {
            return this.app_name;
        }

        @Required
        public Slot<String> getPageName() {
            return this.page_name;
        }

        @Required
        public page setAppName(Slot<String> slot) {
            this.app_name = slot;
            return this;
        }

        @Required
        public page setPageName(Slot<String> slot) {
            this.page_name = slot;
            return this;
        }
    }

    public static class playMode implements EntityType {
        private Optional<Slot<PlaybackMode.PlayMode>> mode = Optional.a();

        public static playMode read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            playMode playmode = new playMode();
            if (zsdVar.z("mode")) {
                playmode.setMode(IntentUtils.readSlot(zsdVar.w("mode"), PlaybackMode.PlayMode.class));
            }
            return playmode;
        }

        public static c4h write(playMode playmode) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (playmode.mode.c()) {
                c4hVarCreateObjectNode.f0("mode", IntentUtils.writeSlot(playmode.mode.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<PlaybackMode.PlayMode>> getMode() {
            return this.mode;
        }

        public playMode setMode(Slot<PlaybackMode.PlayMode> slot) {
            this.mode = Optional.e(slot);
            return this;
        }
    }

    public static class valuables implements EntityType {

        @Required
        private Slot<String> name;

        public valuables() {
        }

        public valuables(Slot<String> slot) {
            this.name = slot;
        }

        public static valuables read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            valuables valuablesVar = new valuables();
            valuablesVar.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
            return valuablesVar;
        }

        public static c4h write(valuables valuablesVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(valuablesVar.name));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<String> getName() {
            return this.name;
        }

        @Required
        public valuables setName(Slot<String> slot) {
            this.name = slot;
            return this;
        }
    }

    public static class verticalScreen implements EntityType {
        public static verticalScreen read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new verticalScreen();
        }

        public static c4h write(verticalScreen verticalscreen) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public App() {
    }

    public static App read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        App app = new App(IntentUtils.readEntityType(zsdVar, AIApiConstants.App.NAME, optional));
        app.setMatched(IntentUtils.readSlot(zsdVar.w("matched"), List.class));
        if (zsdVar.z("name")) {
            app.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
        }
        if (zsdVar.z("type")) {
            app.setType(IntentUtils.readSlot(zsdVar.w("type"), String.class));
        }
        if (zsdVar.z(TSMAuthContants.PARAM_KEYWORD)) {
            app.setKeyword(IntentUtils.readSlot(zsdVar.w(TSMAuthContants.PARAM_KEYWORD), String.class));
        }
        if (zsdVar.z("category")) {
            app.setCategory(IntentUtils.readSlot(zsdVar.w("category"), String.class));
        }
        if (zsdVar.z("age")) {
            app.setAge(IntentUtils.readSlot(zsdVar.w("age"), Miai.Age.class));
        }
        if (zsdVar.z("force")) {
            app.setForce(IntentUtils.readSlot(zsdVar.w("force"), Boolean.class));
        }
        if (zsdVar.z("version")) {
            app.setVersion(IntentUtils.readSlot(zsdVar.w("version"), String.class));
        }
        return app;
    }

    public static zsd write(App app) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(app.entity_type);
        c4hVar.f0("matched", IntentUtils.writeSlot(app.matched));
        if (app.name.c()) {
            c4hVar.f0("name", IntentUtils.writeSlot(app.name.b()));
        }
        if (app.type.c()) {
            c4hVar.f0("type", IntentUtils.writeSlot(app.type.b()));
        }
        if (app.keyword.c()) {
            c4hVar.f0(TSMAuthContants.PARAM_KEYWORD, IntentUtils.writeSlot(app.keyword.b()));
        }
        if (app.category.c()) {
            c4hVar.f0("category", IntentUtils.writeSlot(app.category.b()));
        }
        if (app.age.c()) {
            c4hVar.f0("age", IntentUtils.writeSlot(app.age.b()));
        }
        if (app.force.c()) {
            c4hVar.f0("force", IntentUtils.writeSlot(app.force.b()));
        }
        if (app.version.c()) {
            c4hVar.f0("version", IntentUtils.writeSlot(app.version.b()));
        }
        return c4hVar;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    public Optional<Slot<Miai.Age>> getAge() {
        return this.age;
    }

    public Optional<Slot<String>> getCategory() {
        return this.category;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    public Optional<Slot<Boolean>> getForce() {
        return this.force;
    }

    public Optional<Slot<String>> getKeyword() {
        return this.keyword;
    }

    @Required
    public Slot<List<AppInfo>> getMatched() {
        return this.matched;
    }

    public Optional<Slot<String>> getName() {
        return this.name;
    }

    public Optional<Slot<String>> getType() {
        return this.type;
    }

    public Optional<Slot<String>> getVersion() {
        return this.version;
    }

    public App setAge(Slot<Miai.Age> slot) {
        this.age = Optional.e(slot);
        return this;
    }

    public App setCategory(Slot<String> slot) {
        this.category = Optional.e(slot);
        return this;
    }

    @Required
    public App setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public App setForce(Slot<Boolean> slot) {
        this.force = Optional.e(slot);
        return this;
    }

    public App setKeyword(Slot<String> slot) {
        this.keyword = Optional.e(slot);
        return this;
    }

    @Required
    public App setMatched(Slot<List<AppInfo>> slot) {
        this.matched = slot;
        return this;
    }

    public App setName(Slot<String> slot) {
        this.name = Optional.e(slot);
        return this;
    }

    public App setType(Slot<String> slot) {
        this.type = Optional.e(slot);
        return this;
    }

    public App setVersion(Slot<String> slot) {
        this.version = Optional.e(slot);
        return this;
    }

    public App(T t) {
        this.entity_type = t;
    }

    public App(T t, Slot<List<AppInfo>> slot) {
        this.entity_type = t;
        this.matched = slot;
    }
}
