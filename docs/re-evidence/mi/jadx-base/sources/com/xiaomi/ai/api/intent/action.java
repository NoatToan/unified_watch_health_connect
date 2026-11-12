package com.xiaomi.ai.api.intent;

import com.xiaomi.common.Optional;
import com.xiaomi.common.Pair;
import com.xiaomi.onetrack.util.z;
import defpackage.gv5;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public class action {

    public static class EntityName {
        private String name;
        private Optional<String> prop;

        public EntityName(String str, Optional<String> optional) {
            this.name = str;
            this.prop = optional;
        }

        public String getName() {
            return this.name;
        }

        public Optional<String> getProp() {
            return this.prop;
        }

        public String toString() {
            if (!this.prop.c()) {
                return this.name;
            }
            return this.name + "[" + this.prop.b() + "]";
        }
    }

    public static class ActionName {
        protected static Pattern actonPattern = Pattern.compile("([\\w\\.]+)<([^>]+)>");
        protected static Pattern entityPattern = Pattern.compile("([\\w]+)@([\\w]+)(?:\\[([\\w]+)\\])?");
        private String action;
        private String category;
        private List<Pair<String, EntityName>> entities;
        private String subCategory;

        public ActionName(String str, String str2, String str3, List<Pair<String, EntityName>> list) {
            this.category = str;
            this.subCategory = str2;
            this.action = str3;
            this.entities = list;
        }

        private static String intent(String str, List<Pair<String, EntityName>> list) {
            StringBuilder sb = new StringBuilder();
            for (Pair<String, EntityName> pair : list) {
                if (!sb.toString().equals("")) {
                    sb.append(",");
                }
                sb.append(pair.getLeft());
                sb.append(gv5.CONNECT_VALUE_STR);
                sb.append(pair.getRight().toString());
            }
            return str + "<" + ((Object) sb) + ">";
        }

        public static ActionName newInstance(String str) {
            Matcher matcher = actonPattern.matcher(str);
            if (!matcher.find()) {
                throw new IllegalArgumentException("action name " + str + " is illegal");
            }
            ArrayList arrayList = new ArrayList();
            for (String str2 : matcher.group(2).split(",")) {
                Matcher matcher2 = entityPattern.matcher(str2.trim());
                if (!matcher2.find()) {
                    System.out.println(str2.trim());
                }
                arrayList.add(Pair.of(matcher2.group(1), new EntityName(matcher2.group(2), Optional.e(matcher2.group(3)))));
            }
            String[] strArrSplit = matcher.group(1).split(z.f14007a);
            if (strArrSplit.length == 3) {
                return new ActionName(strArrSplit[0], strArrSplit[1], strArrSplit[2], arrayList);
            }
            throw new IllegalArgumentException("action name " + str + " is illegal");
        }

        public String getAction() {
            return this.action;
        }

        public String getCategory() {
            return this.category;
        }

        public List<Pair<String, EntityName>> getEntities() {
            return this.entities;
        }

        public String getSubCategory() {
            return this.subCategory;
        }

        public String intentName() {
            return intent(this.action, this.entities);
        }

        public String toString() {
            return this.category + "." + this.subCategory + "." + intent(this.action, this.entities);
        }

        public static ActionName newInstance(String str, List<Pair<String, EntityName>> list) {
            Optional<ActionName> optionalFindActionName = ActionFormatRegistry.findActionName(intent(str, list));
            if (!optionalFindActionName.c()) {
                return new ActionName("", "", str, list);
            }
            return optionalFindActionName.b();
        }
    }
}
