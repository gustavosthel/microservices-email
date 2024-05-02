package com.ms.email.DTO;

import java.util.UUID;

public record EmailDTO(UUID userId,
                       String email,
                       String subject,
                       String text) {
}
