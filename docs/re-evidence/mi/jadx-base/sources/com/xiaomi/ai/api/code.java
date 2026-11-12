package com.xiaomi.ai.api;

import com.xiaomi.ai.api.common.Required;
import com.xiaomi.common.Optional;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class code {

    public static class CodeIntention {

        @Required
        private List<Func> functions;

        public CodeIntention() {
        }

        public CodeIntention(List<Func> list) {
            this.functions = list;
        }

        @Required
        public List<Func> getFunctions() {
            return this.functions;
        }

        @Required
        public CodeIntention setFunctions(List<Func> list) {
            this.functions = list;
            return this;
        }
    }

    public static class Func {

        @Required
        private String function;

        @Required
        private Map<String, String> slots;

        public Func() {
        }

        public Func(String str, Map<String, String> map) {
            this.function = str;
            this.slots = map;
        }

        @Required
        public String getFunction() {
            return this.function;
        }

        @Required
        public Map<String, String> getSlots() {
            return this.slots;
        }

        @Required
        public Func setFunction(String str) {
            this.function = str;
            return this;
        }

        @Required
        public Func setSlots(Map<String, String> map) {
            this.slots = map;
            return this;
        }
    }

    public enum SemanticSource {
        UNKNOWN(-1),
        BASE_NLU(0),
        LLM_NLU(1);

        private int id;

        SemanticSource(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class SemanticCode {

        @Required
        private String norm_code;
        private Optional<String> copilot_parser_name = Optional.a();
        private Optional<CodeIntention> code_intention = Optional.a();
        private Optional<SemanticSource> semantic_source = Optional.a();

        public SemanticCode() {
        }

        public Optional<CodeIntention> getCodeIntention() {
            return this.code_intention;
        }

        public Optional<String> getCopilotParserName() {
            return this.copilot_parser_name;
        }

        @Required
        public String getNormCode() {
            return this.norm_code;
        }

        public Optional<SemanticSource> getSemanticSource() {
            return this.semantic_source;
        }

        public SemanticCode setCodeIntention(CodeIntention codeIntention) {
            this.code_intention = Optional.e(codeIntention);
            return this;
        }

        public SemanticCode setCopilotParserName(String str) {
            this.copilot_parser_name = Optional.e(str);
            return this;
        }

        @Required
        public SemanticCode setNormCode(String str) {
            this.norm_code = str;
            return this;
        }

        public SemanticCode setSemanticSource(SemanticSource semanticSource) {
            this.semantic_source = Optional.e(semanticSource);
            return this;
        }

        public SemanticCode(String str) {
            this.norm_code = str;
        }
    }
}
