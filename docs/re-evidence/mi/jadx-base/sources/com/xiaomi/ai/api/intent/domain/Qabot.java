package com.xiaomi.ai.api.intent.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.ai.api.intent.AIApiConstants;
import com.xiaomi.ai.api.intent.EntityType;
import com.xiaomi.ai.api.intent.IntentUtils;
import com.xiaomi.ai.api.intent.IntentionEntity;
import com.xiaomi.ai.api.intent.Slot;
import com.xiaomi.ai.api.intent.general;
import com.xiaomi.ai.api.intent.slots.Miai;
import com.xiaomi.common.Optional;
import defpackage.c4h;
import defpackage.zsd;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class Qabot<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<String>> entity = Optional.a();
    private Optional<Slot<String>> attribute = Optional.a();
    private Optional<Slot<List<EntityLinkingInfo>>> edls = Optional.a();

    public static class ancientPoem implements EntityType {
        public static ancientPoem read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new ancientPoem();
        }

        public static c4h write(ancientPoem ancientpoem) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class animal implements EntityType {
        public static animal read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new animal();
        }

        public static c4h write(animal animalVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class arithMathematicalTerm implements EntityType {
        public static arithMathematicalTerm read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new arithMathematicalTerm();
        }

        public static c4h write(arithMathematicalTerm arithmathematicalterm) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class arithMathematicsTheorem implements EntityType {
        public static arithMathematicsTheorem read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new arithMathematicsTheorem();
        }

        public static c4h write(arithMathematicsTheorem arithmathematicstheorem) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class baikeSchoolUniversity implements EntityType {
        public static baikeSchoolUniversity read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new baikeSchoolUniversity();
        }

        public static c4h write(baikeSchoolUniversity baikeschooluniversity) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class car implements EntityType {
        public static car read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new car();
        }

        public static c4h write(car carVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class carInstruction implements EntityType {
        public static carInstruction read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new carInstruction();
        }

        public static c4h write(carInstruction carinstruction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class chemistryCompound implements EntityType {
        public static chemistryCompound read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new chemistryCompound();
        }

        public static c4h write(chemistryCompound chemistrycompound) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class chemistryElement implements EntityType {
        public static chemistryElement read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new chemistryElement();
        }

        public static c4h write(chemistryElement chemistryelement) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class company implements EntityType {
        public static company read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new company();
        }

        public static c4h write(company companyVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class composition implements EntityType {
        public static composition read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new composition();
        }

        public static c4h write(composition compositionVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class conception implements EntityType {
        public static conception read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new conception();
        }

        public static c4h write(conception conceptionVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class constellationZodiac implements EntityType {
        public static constellationZodiac read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new constellationZodiac();
        }

        public static c4h write(constellationZodiac constellationzodiac) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class dictionary implements EntityType {
        public static dictionary read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new dictionary();
        }

        public static c4h write(dictionary dictionaryVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class epidemic implements EntityType {
        public static epidemic read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new epidemic();
        }

        public static c4h write(epidemic epidemicVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class event implements EntityType {
        public static event read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new event();
        }

        public static c4h write(event eventVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class invention implements EntityType {
        public static invention read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new invention();
        }

        public static c4h write(invention inventionVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class medicalDepartment implements EntityType {
        public static medicalDepartment read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new medicalDepartment();
        }

        public static c4h write(medicalDepartment medicaldepartment) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class medicalDisease implements EntityType {
        public static medicalDisease read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new medicalDisease();
        }

        public static c4h write(medicalDisease medicaldisease) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class medicalFood implements EntityType {
        public static medicalFood read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new medicalFood();
        }

        public static c4h write(medicalFood medicalfood) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class medicalHerbal implements EntityType {
        public static medicalHerbal read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new medicalHerbal();
        }

        public static c4h write(medicalHerbal medicalherbal) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class medicalSpecial implements EntityType {
        public static medicalSpecial read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new medicalSpecial();
        }

        public static c4h write(medicalSpecial medicalspecial) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class mobileVideoFilm implements EntityType {
        public static mobileVideoFilm read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new mobileVideoFilm();
        }

        public static c4h write(mobileVideoFilm mobilevideofilm) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class mobileVideoTvSeries implements EntityType {
        public static mobileVideoTvSeries read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new mobileVideoTvSeries();
        }

        public static c4h write(mobileVideoTvSeries mobilevideotvseries) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class motto implements EntityType {
        public static motto read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new motto();
        }

        public static c4h write(motto mottoVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class music implements EntityType {
        public static music read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new music();
        }

        public static c4h write(music musicVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class networds implements EntityType {
        public static networds read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new networds();
        }

        public static c4h write(networds networdsVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class person implements EntityType {
        public static person read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new person();
        }

        public static c4h write(person personVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class personUltraman implements EntityType {
        public static personUltraman read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new personUltraman();
        }

        public static c4h write(personUltraman personultraman) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class phonecallOrganization implements EntityType {
        public static phonecallOrganization read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new phonecallOrganization();
        }

        public static c4h write(phonecallOrganization phonecallorganization) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class plant implements EntityType {
        public static plant read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new plant();
        }

        public static c4h write(plant plantVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class readingBook implements EntityType {
        public static readingBook read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new readingBook();
        }

        public static c4h write(readingBook readingbook) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class recipe implements EntityType {
        public static recipe read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new recipe();
        }

        public static c4h write(recipe recipeVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class search implements EntityType {
        public static search read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new search();
        }

        public static c4h write(search searchVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class shoppingBrand implements EntityType {
        public static shoppingBrand read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new shoppingBrand();
        }

        public static c4h write(shoppingBrand shoppingbrand) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class sportsFootballTeam implements EntityType {
        public static sportsFootballTeam read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new sportsFootballTeam();
        }

        public static c4h write(sportsFootballTeam sportsfootballteam) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class surnames implements EntityType {
        public static surnames read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new surnames();
        }

        public static c4h write(surnames surnamesVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class telltale implements EntityType {
        private Optional<Slot<String>> ref = Optional.a();
        private Optional<Slot<String>> position = Optional.a();
        private Optional<Slot<Miai.Ordinal>> order = Optional.a();
        private Optional<Slot<String>> reverse = Optional.a();
        private Optional<Slot<Miai.Color>> color = Optional.a();
        private Optional<Slot<String>> keywords = Optional.a();
        private Optional<Slot<String>> status = Optional.a();

        public static telltale read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            telltale telltaleVar = new telltale();
            if (zsdVar.z("ref")) {
                telltaleVar.setRef(IntentUtils.readSlot(zsdVar.w("ref"), String.class));
            }
            if (zsdVar.z("position")) {
                telltaleVar.setPosition(IntentUtils.readSlot(zsdVar.w("position"), String.class));
            }
            if (zsdVar.z("order")) {
                telltaleVar.setOrder(IntentUtils.readSlot(zsdVar.w("order"), Miai.Ordinal.class));
            }
            if (zsdVar.z("reverse")) {
                telltaleVar.setReverse(IntentUtils.readSlot(zsdVar.w("reverse"), String.class));
            }
            if (zsdVar.z("color")) {
                telltaleVar.setColor(IntentUtils.readSlot(zsdVar.w("color"), Miai.Color.class));
            }
            if (zsdVar.z("keywords")) {
                telltaleVar.setKeywords(IntentUtils.readSlot(zsdVar.w("keywords"), String.class));
            }
            if (zsdVar.z("status")) {
                telltaleVar.setStatus(IntentUtils.readSlot(zsdVar.w("status"), String.class));
            }
            return telltaleVar;
        }

        public static c4h write(telltale telltaleVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (telltaleVar.ref.c()) {
                c4hVarCreateObjectNode.f0("ref", IntentUtils.writeSlot(telltaleVar.ref.b()));
            }
            if (telltaleVar.position.c()) {
                c4hVarCreateObjectNode.f0("position", IntentUtils.writeSlot(telltaleVar.position.b()));
            }
            if (telltaleVar.order.c()) {
                c4hVarCreateObjectNode.f0("order", IntentUtils.writeSlot(telltaleVar.order.b()));
            }
            if (telltaleVar.reverse.c()) {
                c4hVarCreateObjectNode.f0("reverse", IntentUtils.writeSlot(telltaleVar.reverse.b()));
            }
            if (telltaleVar.color.c()) {
                c4hVarCreateObjectNode.f0("color", IntentUtils.writeSlot(telltaleVar.color.b()));
            }
            if (telltaleVar.keywords.c()) {
                c4hVarCreateObjectNode.f0("keywords", IntentUtils.writeSlot(telltaleVar.keywords.b()));
            }
            if (telltaleVar.status.c()) {
                c4hVarCreateObjectNode.f0("status", IntentUtils.writeSlot(telltaleVar.status.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Miai.Color>> getColor() {
            return this.color;
        }

        public Optional<Slot<String>> getKeywords() {
            return this.keywords;
        }

        public Optional<Slot<Miai.Ordinal>> getOrder() {
            return this.order;
        }

        public Optional<Slot<String>> getPosition() {
            return this.position;
        }

        public Optional<Slot<String>> getRef() {
            return this.ref;
        }

        public Optional<Slot<String>> getReverse() {
            return this.reverse;
        }

        public Optional<Slot<String>> getStatus() {
            return this.status;
        }

        public telltale setColor(Slot<Miai.Color> slot) {
            this.color = Optional.e(slot);
            return this;
        }

        public telltale setKeywords(Slot<String> slot) {
            this.keywords = Optional.e(slot);
            return this;
        }

        public telltale setOrder(Slot<Miai.Ordinal> slot) {
            this.order = Optional.e(slot);
            return this;
        }

        public telltale setPosition(Slot<String> slot) {
            this.position = Optional.e(slot);
            return this;
        }

        public telltale setRef(Slot<String> slot) {
            this.ref = Optional.e(slot);
            return this;
        }

        public telltale setReverse(Slot<String> slot) {
            this.reverse = Optional.e(slot);
            return this;
        }

        public telltale setStatus(Slot<String> slot) {
            this.status = Optional.e(slot);
            return this;
        }
    }

    public static class timeFestival implements EntityType {
        public static timeFestival read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new timeFestival();
        }

        public static c4h write(timeFestival timefestival) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class timeTime implements EntityType {
        public static timeTime read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new timeTime();
        }

        public static c4h write(timeTime timetime) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class touristSpotCity implements EntityType {
        public static touristSpotCity read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new touristSpotCity();
        }

        public static c4h write(touristSpotCity touristspotcity) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class touristSpotCountry implements EntityType {
        public static touristSpotCountry read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new touristSpotCountry();
        }

        public static c4h write(touristSpotCountry touristspotcountry) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class touristSpotCounty implements EntityType {
        public static touristSpotCounty read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new touristSpotCounty();
        }

        public static c4h write(touristSpotCounty touristspotcounty) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class touristSpotPlace implements EntityType {
        public static touristSpotPlace read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new touristSpotPlace();
        }

        public static c4h write(touristSpotPlace touristspotplace) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class touristSpotProvince implements EntityType {
        public static touristSpotProvince read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new touristSpotProvince();
        }

        public static c4h write(touristSpotProvince touristspotprovince) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class touristSpotScenic implements EntityType {
        public static touristSpotScenic read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new touristSpotScenic();
        }

        public static c4h write(touristSpotScenic touristspotscenic) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class translationEnglish implements EntityType {
        public static translationEnglish read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new translationEnglish();
        }

        public static c4h write(translationEnglish translationenglish) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class xiehouyu implements EntityType {
        public static xiehouyu read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new xiehouyu();
        }

        public static c4h write(xiehouyu xiehouyuVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public Qabot() {
    }

    public static Qabot read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        Qabot qabot = new Qabot(IntentUtils.readEntityType(zsdVar, AIApiConstants.Qabot.NAME, optional));
        if (zsdVar.z("entity")) {
            qabot.setEntity(IntentUtils.readSlot(zsdVar.w("entity"), String.class));
        }
        if (zsdVar.z("attribute")) {
            qabot.setAttribute(IntentUtils.readSlot(zsdVar.w("attribute"), String.class));
        }
        if (zsdVar.z("edls")) {
            qabot.setEdls(IntentUtils.readSlot(zsdVar.w("edls"), List.class));
        }
        return qabot;
    }

    public static zsd write(Qabot qabot) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(qabot.entity_type);
        if (qabot.entity.c()) {
            c4hVar.f0("entity", IntentUtils.writeSlot(qabot.entity.b()));
        }
        if (qabot.attribute.c()) {
            c4hVar.f0("attribute", IntentUtils.writeSlot(qabot.attribute.b()));
        }
        if (qabot.edls.c()) {
            c4hVar.f0("edls", IntentUtils.writeSlot(qabot.edls.b()));
        }
        return c4hVar;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    public Optional<Slot<String>> getAttribute() {
        return this.attribute;
    }

    public Optional<Slot<List<EntityLinkingInfo>>> getEdls() {
        return this.edls;
    }

    public Optional<Slot<String>> getEntity() {
        return this.entity;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    public Qabot setAttribute(Slot<String> slot) {
        this.attribute = Optional.e(slot);
        return this;
    }

    public Qabot setEdls(Slot<List<EntityLinkingInfo>> slot) {
        this.edls = Optional.e(slot);
        return this;
    }

    public Qabot setEntity(Slot<String> slot) {
        this.entity = Optional.e(slot);
        return this;
    }

    @Required
    public Qabot setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public Qabot(T t) {
        this.entity_type = t;
    }
}
